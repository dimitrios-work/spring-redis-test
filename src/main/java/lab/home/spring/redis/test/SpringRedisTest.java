/*
 * Copyright (C) 2016 Dimitrios Dimas <dimitrios.work@outlook.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package lab.home.spring.redis.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Dimitrios Dimas <dimitrios.work@outlook.com>
 */
public class SpringRedisTest {

    public static void main(String argv[]) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(RedisTestConfig.class);
        DictionaryDao ddao = ctx.getBean(DictionaryDao.class);

        try {
            System.out.println("ddao.setValue(\"key1\", \"value1\")");
            ddao.setValue("key1", "value1");
            System.out.println("ddao.setValue(\"testkey\", \"testvalue\")");
            ddao.setValue("testkey", "testvalue");
            System.out.println("getting value for key1 = " + ddao.getValue("key1"));
            System.out.println("getting value for testkey = " + ddao.getValue("testkey"));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getCause());
            System.out.println(e.getClass());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
    }
}
