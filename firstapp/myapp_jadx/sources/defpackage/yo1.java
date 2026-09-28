package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import com.sportybet.android.user.avatar.avatarview.AvatarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yo1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yo1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = AvatarView.e;
                ComponentCallbacks2 componentCallbacks2B = wc.b((Context) obj);
                componentCallbacks2B.getClass();
                w8i0 w8i0Var = (w8i0) componentCallbacks2B;
                v8i0 viewModelStore = w8i0Var.getViewModelStore();
                boolean z = w8i0Var instanceof iel;
                r8i0.c defaultViewModelProviderFactory = z ? ((iel) w8i0Var).getDefaultViewModelProviderFactory() : fjd.a;
                cyb defaultViewModelCreationExtras = z ? ((iel) w8i0Var).getDefaultViewModelCreationExtras() : cyb.a.b;
                viewModelStore.getClass();
                defaultViewModelProviderFactory.getClass();
                defaultViewModelCreationExtras.getClass();
                s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                dq7 dq7VarA = jq40.a(po1.class);
                String strI = dq7VarA.i();
                if (strI != null) {
                    return (po1) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                }
                hb5.a("Local and anonymous classes can not be ViewModels");
                return null;
            default:
                ((Function1) obj).invoke(wae.DAILY_STREAK);
                return Unit.a;
        }
    }
}
