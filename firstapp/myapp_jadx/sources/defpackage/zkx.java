package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zkx {
    public final rtw<Object, Object> a = tlw.b();
    public final rtw<Object, Object> b = tlw.b();

    public final void a(final z6w z6wVar) {
        Object objD = this.b.d(z6wVar);
        if (objD != null) {
            boolean z = objD instanceof etw;
            rtw<Object, Object> rtwVar = this.a;
            if (!z) {
                tlw.d(rtwVar, (w6w) objD, new Function1() { // from class: ykx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((blx) obj).b == z6wVar);
                    }
                });
                return;
            }
            ccy ccyVar = (ccy) objD;
            Object[] objArr = ccyVar.a;
            int i = ccyVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                obj.getClass();
                tlw.d(rtwVar, (w6w) obj, new Function1() { // from class: ykx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(((blx) obj2).b == z6wVar);
                    }
                });
            }
        }
    }
}
