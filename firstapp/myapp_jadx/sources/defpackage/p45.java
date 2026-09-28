package defpackage;

import android.view.View;
import android.widget.ToggleButton;
import com.sporty.android.sportytv.data.SportyTvDataStoreData;
import com.sporty.android.sportytv.ui.MySportyTvListFragment;
import com.sportybet.plugin.myfavorite.widget.BottomLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p45 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p45(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                int i2 = BottomLayout.d;
                ((BottomLayout) obj2).onClick((View) obj);
                return Unit.a;
            case 1:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((Function1) obj2).invoke(new jxo(urrVar.a()));
                return Unit.a;
            default:
                MySportyTvListFragment mySportyTvListFragment = (MySportyTvListFragment) obj2;
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    boolean zAreNotificationsEnabled = new t2y(mySportyTvListFragment.requireContext()).b.areNotificationsEnabled();
                    ToggleButton toggleButton = mySportyTvListFragment.C;
                    if (zAreNotificationsEnabled) {
                        if (toggleButton == null) {
                            Intrinsics.n("toggleView");
                            throw null;
                        }
                        toggleButton.setChecked(((Boolean) ((SportyTvDataStoreData) ((lk50.c) lk50Var).a).isTrue()).booleanValue());
                    } else {
                        if (toggleButton == null) {
                            Intrinsics.n("toggleView");
                            throw null;
                        }
                        toggleButton.setChecked(false);
                    }
                } else if (lk50Var instanceof lk50.a) {
                    ToggleButton toggleButton2 = mySportyTvListFragment.C;
                    if (toggleButton2 == null) {
                        Intrinsics.n("toggleView");
                        throw null;
                    }
                    toggleButton2.setChecked(false);
                }
                return Unit.a;
        }
    }
}
