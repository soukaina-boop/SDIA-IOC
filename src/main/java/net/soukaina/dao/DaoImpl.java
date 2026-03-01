package net.soukaina.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version base de données");
        double t = 34;
        return t;
    }
}
