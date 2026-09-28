package defpackage;

import com.sportybet.android.bvn.VerifyBvnActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b5a0 implements wie.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ b5a0(Object obj) {
        this.a = obj;
    }

    public void a() {
        Function2 function2 = (Function2) this.a;
        synchronized (n5a0.c) {
            n5a0.h = CollectionsKt.g0(n5a0.h, function2);
            Unit unit = Unit.a;
        }
    }

    @Override // wie.b
    public void b() {
        VerifyBvnActivity verifyBvnActivity = (VerifyBvnActivity) this.a;
        int i = VerifyBvnActivity.B;
        verifyBvnActivity.M1(105);
    }
}
