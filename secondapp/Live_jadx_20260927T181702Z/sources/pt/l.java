package pt;

import com.ironsource.C4235d4;
import cv.k0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final o<T> f121032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f121033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public T f121034c;

    public void b() {
        if (this.f121034c == null) {
            this.f121033b++;
        }
    }

    public void c(@oy.l T objectType) {
        m0.p(objectType, "objectType");
        d(objectType);
    }

    public final void d(@oy.l T type) {
        m0.p(type, "type");
        if (this.f121034c == null) {
            if (this.f121033b > 0) {
                type = this.f121032a.a(k0.v2(C4235d4.j.f61460d, this.f121033b) + this.f121032a.e(type));
            }
            this.f121034c = type;
        }
    }

    public void e(@oy.l wt.f name, @oy.l T type) {
        m0.p(name, "name");
        m0.p(type, "type");
        d(type);
    }

    public void a() {
    }
}
