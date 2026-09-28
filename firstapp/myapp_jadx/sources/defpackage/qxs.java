package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class qxs extends pxs {
    public final ibs a;
    public final c b;

    public static class a<D> extends ssw<D> {
        public final hkk0 l;
        public ibs m;
        public b<D> n;

        public a(hkk0 hkk0Var) {
            this.l = hkk0Var;
            if (hkk0Var.a == null) {
                hkk0Var.a = this;
            } else {
                ib5.a("There is already a listener registered");
                throw null;
            }
        }

        @Override // defpackage.njs
        public final void h() {
            hkk0 hkk0Var = this.l;
            hkk0Var.b = true;
            hkk0Var.d = false;
            hkk0Var.c = false;
            hkk0Var.i.drainPermits();
            hkk0Var.d();
        }

        @Override // defpackage.njs
        public final void i() {
            this.l.b = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.njs
        public final void k(lfy<? super D> lfyVar) {
            super.k(lfyVar);
            this.m = null;
            this.n = null;
        }

        public final void n() {
            ibs ibsVar = this.m;
            b<D> bVar = this.n;
            if (ibsVar == null || bVar == null) {
                return;
            }
            super.k(bVar);
            f(ibsVar, bVar);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            Class<?> cls = this.l.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class b<D> implements lfy<D> {
        public final klk0 a;
        public boolean b = false;

        public b(hkk0 hkk0Var, klk0 klk0Var) {
            this.a = klk0Var;
        }

        public final String toString() {
            return this.a.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lfy
        public final void u1(D d) {
            this.b = true;
            SignInHubActivity signInHubActivity = this.a.a;
            signInHubActivity.setResult(signInHubActivity.d, signInHubActivity.e);
            signInHubActivity.finish();
        }
    }

    public static class c extends j8i0 {
        public static final a c = new a();
        public final esa0<a> a = new esa0<>();
        public boolean b = false;

        public static class a implements r8i0.c {
            @Override // r8i0.c
            public final <T extends j8i0> T c(Class<T> cls) {
                return new c();
            }
        }

        @Override // defpackage.j8i0
        public final void onCleared() {
            super.onCleared();
            esa0<a> esa0Var = this.a;
            int iE = esa0Var.e();
            for (int i = 0; i < iE; i++) {
                a aVarF = esa0Var.f(i);
                hkk0 hkk0Var = aVarF.l;
                hkk0Var.c();
                hkk0Var.c = true;
                b<D> bVar = aVarF.n;
                if (bVar != 0) {
                    aVarF.k(bVar);
                }
                a aVar = hkk0Var.a;
                if (aVar == null) {
                    ib5.a("No listener register");
                    return;
                }
                if (aVar != aVarF) {
                    hb5.a("Attempting to unregister the wrong listener");
                    return;
                }
                hkk0Var.a = null;
                if (bVar != 0) {
                    boolean z = bVar.b;
                }
                hkk0Var.d = true;
                hkk0Var.b = false;
                hkk0Var.c = false;
                hkk0Var.e = false;
            }
            int i2 = esa0Var.d;
            Object[] objArr = esa0Var.c;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            esa0Var.d = 0;
            esa0Var.a = false;
        }
    }

    public qxs(ibs ibsVar, v8i0 v8i0Var) {
        this.a = ibsVar;
        v8i0Var.getClass();
        cyb.a aVar = cyb.a.b;
        aVar.getClass();
        s8i0 s8i0Var = new s8i0(v8i0Var, c.c, aVar);
        dq7 dq7VarA = jq40.a(c.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            this.b = (c) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        } else {
            hb5.a("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.b;
        if (cVar.a.e() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < cVar.a.e(); i++) {
                a aVarF = cVar.a.f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.a.c(i));
                printWriter.print(": ");
                printWriter.println(aVarF.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(aVarF.l);
                hkk0 hkk0Var = aVarF.l;
                String strConcat = str2.concat("  ");
                hkk0Var.getClass();
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(hkk0Var.a);
                if (hkk0Var.b || hkk0Var.e) {
                    printWriter.print(strConcat);
                    printWriter.print("mStarted=");
                    printWriter.print(hkk0Var.b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(hkk0Var.e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (hkk0Var.c || hkk0Var.d) {
                    printWriter.print(strConcat);
                    printWriter.print("mAbandoned=");
                    printWriter.print(hkk0Var.c);
                    printWriter.print(" mReset=");
                    printWriter.println(hkk0Var.d);
                }
                if (hkk0Var.g != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mTask=");
                    printWriter.print(hkk0Var.g);
                    printWriter.print(" waiting=");
                    hkk0Var.g.getClass();
                    printWriter.println(false);
                }
                if (hkk0Var.h != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(hkk0Var.h);
                    printWriter.print(" waiting=");
                    hkk0Var.h.getClass();
                    printWriter.println(false);
                }
                if (aVarF.n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVarF.n);
                    b<D> bVar = aVarF.n;
                    String strConcat2 = str2.concat("  ");
                    bVar.getClass();
                    printWriter.print(strConcat2);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                hkk0 hkk0Var2 = aVarF.l;
                D d = aVarF.d();
                hkk0Var2.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (d == 0) {
                    sb.append("null");
                } else {
                    Class<?> cls = d.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aVarF.e());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
