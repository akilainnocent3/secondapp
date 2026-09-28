package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lju20;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "Lj9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ju20 extends s0m implements k9j, j9j {

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ju20 ju20Var = (ju20) this.receiver;
            ju20Var.getClass();
            yfx.l(NavHostFragment.a.a(ju20Var), gz20.INSTANCE);
            return Unit.a;
        }
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getF() {
        return ju20.class.getSimpleName();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(-145978752, new e0z(this, 1), true));
        return composeView;
    }
}
