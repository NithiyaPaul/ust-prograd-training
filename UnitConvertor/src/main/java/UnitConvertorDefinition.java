class UnitConvertorDefinition implements UnitConvertor{
    public double sameToSameConvertor(double unit){
        return unit;
    }
    public double kiloToBaseConvertor(double unit){
        return unit*1000;
    }
    public double baseToKiloConvertor(double unit){
        return unit/1000;
    }
    public double centiToKiloConvertor(double unit){
        return unit/100000;
    }
    public double baseToCentiConvertor(double unit){
        return unit*100;
    }
    public double centiToBaseConvertor(double unit){
        return unit/100;
    }
    public double kiloToCentiConvertor(double unit){
        return unit*100000;
    }
}
