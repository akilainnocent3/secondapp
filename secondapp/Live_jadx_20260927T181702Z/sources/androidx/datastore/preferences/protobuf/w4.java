package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public abstract class w4<T, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f10315a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile int f10316b = 100;

    public abstract void a(B fields, int number, int value);

    public abstract void b(B fields, int number, long value);

    public abstract void c(B fields, int number, T subFieldSet);

    public abstract void d(B fields, int number, u value);

    public abstract void e(B fields, int number, long value);

    public abstract B f(Object message);

    public abstract T g(Object message);

    public abstract int h(T unknowns);

    public abstract int i(T message);

    public abstract void j(Object message);

    public abstract T k(T destination, T source);

    public final void l(B unknownFields, t3 reader, int currentDepth) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && m(unknownFields, reader, currentDepth)) {
        }
    }

    public final boolean m(B unknownFields, t3 reader, int currentDepth) throws IOException {
        int tag = reader.getTag();
        int iA = f5.a(tag);
        int iB = f5.b(tag);
        if (iB == 0) {
            e(unknownFields, iA, reader.readInt64());
            return true;
        }
        if (iB == 1) {
            b(unknownFields, iA, reader.readFixed64());
            return true;
        }
        if (iB == 2) {
            d(unknownFields, iA, reader.readBytes());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw y1.k();
            }
            a(unknownFields, iA, reader.readFixed32());
            return true;
        }
        B bN = n();
        int iC = f5.c(iA, 4);
        int i10 = currentDepth + 1;
        if (i10 >= f10316b) {
            throw y1.o();
        }
        l(bN, reader, i10);
        if (iC != reader.getTag()) {
            throw y1.h();
        }
        c(unknownFields, iA, s(bN));
        return true;
    }

    public abstract B n();

    public abstract void o(Object message, B builder);

    public void p(int limit) {
        f10316b = limit;
    }

    public abstract void q(Object message, T fields);

    public abstract boolean r(t3 reader);

    public abstract T s(B fields);

    public abstract void t(T unknownFields, h5 writer) throws IOException;

    public abstract void u(T unknownFields, h5 writer) throws IOException;
}
