package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
public final class uq7 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luq7$a;", "Landroidx/fragment/app/d;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends d {
        public b a;

        public a() {
            super(R.layout.clear_selections_warning_dialog);
        }

        @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
        public final void onDestroyView() {
            super.onDestroyView();
            this.a = null;
        }

        @Override // androidx.fragment.app.Fragment
        public final void onViewCreated(View view, Bundle bundle) {
            view.getClass();
            super.onViewCreated(view, bundle);
            ((TextView) view.findViewById(R.id.content)).setText(sn5.c(view, iu2.p() ? R.string.common_functions__sim_mode_off_info : R.string.common_functions__editing_bet_will_clear_betslip, new Object[0]));
            TextView textView = (TextView) view.findViewById(R.id.btn_clear_selection);
            int i = iu2.p() ? R.string.common_functions__continue : R.string.common_functions__clear_betslip_and_continue;
            textView.getClass();
            textView.setText(sn5.c(textView, i, new Object[0]));
            textView.setOnClickListener(new sq7(this, 0));
            ((TextView) view.findViewById(R.id.cancel)).setOnClickListener(new tq7(this, 0));
        }
    }

    public interface b {
        void a();
    }

    public static void a(Context context, b bVar) {
        context.getClass();
        FragmentManager supportFragmentManager = null;
        try {
            Context contextB = dvi.b(context);
            contextB.getClass();
            supportFragmentManager = ((e) contextB).getSupportFragmentManager();
            if (supportFragmentManager.H("ClearSelectionsWarningDialog") != null) {
                itf0.a aVar = itf0.a;
                aVar.q("ClearSelectionsWarningDialog");
                aVar.a("a dialog is already on the screen", new Object[0]);
                return;
            }
        } catch (ClassCastException unused) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("ClearSelectionsWarningDialog");
            aVar2.a("Can't get fragment manager", new Object[0]);
        }
        if (supportFragmentManager == null || supportFragmentManager.K) {
            return;
        }
        a aVar3 = new a();
        aVar3.setCancelable(false);
        aVar3.a = bVar;
        aVar3.show(supportFragmentManager, "ClearSelectionsWarningDialog");
    }
}
