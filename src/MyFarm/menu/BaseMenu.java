/**
 * 目录，可用于实现迭代器、组合模式
 */
package MyFarm.menu;

import MyFarm.creature.Creature;

import java.io.Serializable;
import java.util.List;

public abstract class BaseMenu implements Serializable {
    public List<Creature> creatures;
}
