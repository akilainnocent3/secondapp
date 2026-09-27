package yads;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sx1 extends i {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient y43 f155627h;

    public sx1(Map map, ox1 ox1Var) {
        super(map);
        this.f155627h = (y43) ng2.a(ox1Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f155627h = (y43) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.f146594f = map;
        this.f146595g = 0;
        for (Collection collection : map.values()) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException();
            }
            this.f146595g = collection.size() + this.f146595g;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f155627h);
        objectOutputStream.writeObject(this.f146594f);
    }
}
