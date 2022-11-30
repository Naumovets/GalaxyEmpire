package logic;

import spaceObject.SpaceObject;

public class Physics {
    //  Сила всемирного тяготения
    public static double F(double m1, double m2, double d ){
        final double G = 6.67*Math.pow(10,-11);
        return (G*m1*m2)/Math.pow(d,2);
    }

    //  Проекция импульса на X
    public static double Px(SpaceObject obj){
        return obj.getVx()*obj.getM();
    }
    //  Проекция импульса на Y
    public static double Py(SpaceObject obj){
        return obj.getVy()*obj.getM();
    }
    //  скорость по x по закону сохранения импульса
    public static double RVpx(SpaceObject obj1, SpaceObject obj2){
        double m = obj1.getM() + obj2.getM();
        double resPx = Px(obj1)+Px(obj2);
        return resPx/m;
    }

    //  скорость по y по закону сохранения импульса
    public static double RVpy(SpaceObject obj1, SpaceObject obj2){
        double m = obj1.getM() + obj2.getM();
        double resPy = Py(obj1)+Py(obj2);
        return resPy/m;
    }


    // физика симуляции написано на js, надо будет переписать
//    function phys() {
//        // просчет сумм всех сил на все объекты
//        for(var i = 0; i < objects.length; i++){
//            for(var j = 0; j < objects.length; j++){
//                if(j == i){
//                    continue;
//                }
//                var m1 = objects[i].m, m2 = objects[j].m;
//                var d = distance(objects[i],objects[j])*scale;
//                var f = F(m1,m2,d);
//                var a = f*timeSpeed/(m1*FPS*scale);
//                objects[i].vx += a*cos(objects[i],objects[j]);
//                objects[i].vy += a*sin(objects[i],objects[j]);
//            }
//        }
//        // собственно само перемещение объекта
//        for(var i = 0; i < objects.length; i++){
//            objects[i].x +=objects[i].vx*timeSpeed/FPS;
//            objects[i].y +=objects[i].vy*timeSpeed/FPS;
//        }
//        // просчет столкновений
//        for(var i = 0; i < objects.length; i++){
//            for(var j = 0; j < objects.length; j++){
//                if(i == j){
//                    continue;
//                }
//                if(collision(objects[i],objects[j])){
//                    break;
//                }
//            }
//        }
}
