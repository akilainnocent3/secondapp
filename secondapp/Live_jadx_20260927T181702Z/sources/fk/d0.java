package fk;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk.g f84761b;

    public d0(String str, lk.g gVar) {
        this.f84760a = str;
        this.f84761b = gVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            ck.g.f().e("Error creating marker: " + this.f84760a, e10);
            return false;
        }
    }

    public final File b() {
        return this.f84761b.h(this.f84760a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
