package pojo;

import java.util.*;

/**
 * 复杂类型xml装配
 */
public class ComplexAssembly {
    private Long id;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;
    private String[] array;

    @Override
    public String toString() {
        return "ComplexAssembly{" +
                "id=" + id +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
}
