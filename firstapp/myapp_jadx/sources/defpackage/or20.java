package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lor20;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "Lj9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class or20 extends p0m implements k9j, j9j {

    public static final /* synthetic */ class a extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((yfx) this.a).k();
            return Unit.a;
        }
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getF() {
        return or20.class.getSimpleName();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PrimaryPhoneConfig primaryPhoneConfig;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments == null || (primaryPhoneConfig = (PrimaryPhoneConfig) ((Parcelable) rj5.a(arguments, "config", PrimaryPhoneConfig.class))) == null) {
            primaryPhoneConfig = new PrimaryPhoneConfig(false, false, false, 0, false, 0, false, 0, null, 0, 1023, null);
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(-1352694617, new mr20(primaryPhoneConfig, composeView, this), true));
        return composeView;
    }
}
