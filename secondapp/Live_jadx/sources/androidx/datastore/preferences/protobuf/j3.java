package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public final class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f10060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f10061c;

    public j3(int id2, Field caseField, Field valueField) {
        this.f10059a = id2;
        this.f10060b = caseField;
        this.f10061c = valueField;
    }

    public Field a() {
        return this.f10060b;
    }

    public int b() {
        return this.f10059a;
    }

    public Field c() {
        return this.f10061c;
    }
}
