package defpackage;

import com.sportybet.android.social.data.local.SocialDatabase_Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uns implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uns(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((vns) obj).dismissAllowingStateLoss();
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(d7x.b.a);
                return Unit.a;
            default:
                return new r7a0((SocialDatabase_Impl) obj);
        }
    }
}
