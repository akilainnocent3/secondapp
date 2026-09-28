package com.esotericsoftware.spine.android;

import defpackage.ef4;
import defpackage.mw0;
import defpackage.oc0;
import defpackage.owh;
import defpackage.pvo;
import defpackage.q120;
import defpackage.q590;
import defpackage.qx90;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final short[] d = {0, 1, 2, 2, 3, 0};
    public final qx90 a = new qx90();
    public final C0187a b = new C0187a(10);
    public final mw0<b> c = new mw0<>();

    /* JADX INFO: renamed from: com.esotericsoftware.spine.android.a$a, reason: collision with other inner class name */
    public class C0187a extends q120<b> {
        @Override // defpackage.q120
        public final b c() {
            return new b();
        }
    }

    public static class b implements q120.a {
        public final owh a = new owh(32, 0);
        public final owh b = new owh(32, 0);
        public final pvo c = new pvo(32, 0);
        public final q590 d = new q590(32, 0);
        public ef4 e;
        public oc0 f;

        @Override // q120.a
        public final void reset() {
            this.a.d(0);
            this.b.d(0);
            this.c.a(0);
            this.d.f(0);
            this.e = null;
            this.f = null;
        }
    }
}
