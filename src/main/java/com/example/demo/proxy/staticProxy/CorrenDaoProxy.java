package com.example.demo.proxy.staticProxy;

/**
 * @author ZhangGR
 * @created on 2018/5/23
 **/
public class CorrenDaoProxy implements ICorrenDao {

    private ICorrenDao correnDao;

    public CorrenDaoProxy(ICorrenDao correnDao) {
        this.correnDao = correnDao;
    }

    /**
     * @should test
     */
    @Override
    public void love() {
        System.out.println("I met Kate nearby the Wong Tai Sim metro station on the morning of Dec. 30th, 2017");
        correnDao.love();
        System.out.println("I have fallen in deep love with her! I must work hard to be able to live her a quality life!");
    }
}
