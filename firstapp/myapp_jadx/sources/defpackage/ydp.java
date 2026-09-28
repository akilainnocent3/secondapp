package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ydp implements php<wdp> {
    public static final ydp a = new ydp();
    public static final a b = a.b;

    public static final class a implements pd80 {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonObject";
        public final /* synthetic */ xfs a;

        public a() {
            hj5.b(k9e0.a);
            gae0 gae0Var = gae0.a;
            adp adpVar = adp.a;
            pd80 descriptor = gae0Var.getDescriptor();
            pd80 descriptor2 = adpVar.getDescriptor();
            descriptor.getClass();
            descriptor2.getClass();
            this.a = new xfs("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
        }

        @Override // defpackage.pd80
        public final boolean b() {
            return false;
        }

        @Override // defpackage.pd80
        public final int c(String str) {
            str.getClass();
            return this.a.c(str);
        }

        @Override // defpackage.pd80
        public final int d() {
            return 2;
        }

        @Override // defpackage.pd80
        public final String e(int i) {
            return String.valueOf(i);
        }

        @Override // defpackage.pd80
        public final List<Annotation> f(int i) {
            return this.a.f(i);
        }

        @Override // defpackage.pd80
        public final pd80 g(int i) {
            return this.a.g(i);
        }

        @Override // defpackage.pd80
        public final List<Annotation> getAnnotations() {
            return m2g.a;
        }

        @Override // defpackage.pd80
        public final yd80 getKind() {
            return ebe0.c.a;
        }

        @Override // defpackage.pd80
        public final String h() {
            return c;
        }

        @Override // defpackage.pd80
        public final boolean i(int i) {
            this.a.i(i);
            return false;
        }

        @Override // defpackage.pd80
        public final boolean isInline() {
            return false;
        }
    }

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        cdp.a(b5dVar);
        hj5.b(k9e0.a);
        return new wdp(new yfs(gae0.a, adp.a).deserialize(b5dVar));
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        wdp wdpVar = (wdp) obj;
        wdpVar.getClass();
        cdp.b(f4gVar);
        hj5.b(k9e0.a);
        new yfs(gae0.a, adp.a).serialize(f4gVar, wdpVar);
    }
}
