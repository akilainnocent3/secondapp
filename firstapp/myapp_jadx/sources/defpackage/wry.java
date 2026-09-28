package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwry;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wry extends Fragment {
    public static final /* synthetic */ ohp<Object>[] b = {new d630(0, wry.class, "binding", "getBinding()Lcom/sportybet/android/databinding/SprInsurePageOneTwoUpBinding;")};
    public final i6i0 a;

    public static final /* synthetic */ class a extends saj implements Function1<View, bid0> {
        public static final a a = new a(1, bid0.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/SprInsurePageOneTwoUpBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final bid0 invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.one_two_up;
            TextView textView = (TextView) h5e.a(R.id.one_two_up, view2);
            if (textView != null) {
                i = R.id.one_two_up_info;
                TextView textView2 = (TextView) h5e.a(R.id.one_two_up_info, view2);
                if (textView2 != null) {
                    return new bid0((ScrollView) view2, textView, textView2);
                }
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public wry() {
        super(R.layout.spr_insure_page_one_two_up);
        this.a = g5e.a(a.a);
    }

    public static void j0(TextView textView, int i) {
        Resources resources = textView.getContext().getResources();
        ThreadLocal<TypedValue> threadLocal = th50.a;
        Drawable drawable = resources.getDrawable(i, null);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, zuy] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Object bVar;
        T t;
        view.getClass();
        super.onViewCreated(view, bundle);
        dq40 dq40Var = new dq40();
        ?? r8 = zuy.b;
        dq40Var.a = r8;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_show_name_in_content", false);
            String string = arguments.getString("key_one_two_up_state");
            if (string != null) {
                try {
                    t = r8;
                    zi50.a aVar = zi50.b;
                    bVar = zuy.valueOf(string);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Object obj = zuy.b;
                if (bVar instanceof zi50.b) {
                    bVar = obj;
                }
                t = (zuy) bVar;
            }
            t = r8;
            dq40Var.a = t;
        } else {
            z = false;
        }
        bid0 bid0Var = (bid0) this.a.a(this, b[0]);
        int iOrdinal = ((zuy) dq40Var.a).ordinal();
        if (iOrdinal == 0) {
            bid0Var.b.setText(sn5.d(this, R.string.common_bet_ways__1up_and_2up, new Object[0]));
            j0(bid0Var.b, R.drawable.ic_up_flag_normal);
            bid0Var.c.setText(sn5.d(this, R.string.component_betslip__1up_and_2up_intro, new Object[0]));
        } else if (iOrdinal == 1) {
            bid0Var.b.setText(sn5.d(this, R.string.common_bet_ways__1up_and_2up, new Object[0]));
            j0(bid0Var.b, R.drawable.ic_up_flag_normal);
            bid0Var.c.setText(sn5.d(this, R.string.component_betslip__1up_and_2up_intro, new Object[0]));
        } else if (iOrdinal == 2) {
            bid0Var.b.setText(sn5.d(this, R.string.common_bet_ways__1up, new Object[0]));
            j0(bid0Var.b, R.drawable.ic_up_flag_normal);
            bid0Var.c.setText(sn5.d(this, R.string.component_betslip__1up_intro, new Object[0]));
        } else if (iOrdinal != 3) {
            uhc.a();
            return;
        } else {
            bid0Var.b.setText(sn5.d(this, R.string.common_bet_ways__2up, new Object[0]));
            j0(bid0Var.b, R.drawable.icon_2up);
            bid0Var.c.setText(sn5.d(this, R.string.component_betslip__2up_intro, new Object[0]));
        }
        if (z) {
            bid0Var.b.setVisibility(0);
        } else {
            bid0Var.b.setVisibility(8);
        }
    }
}
