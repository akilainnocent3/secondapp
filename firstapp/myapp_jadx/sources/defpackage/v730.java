package defpackage;

import android.R;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class v730 implements TabLayout.d {
    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
        gVar.getClass();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        gVar.getClass();
        q730.a aVar = q730.D;
        TextView textView = (TextView) gVar.h.findViewById(R.id.text1);
        if (textView != null) {
            textView.setTextAppearance(com.sportybet.android.gp.tz.R.style.InnerPaymentTabSelected);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        gVar.getClass();
        q730.a aVar = q730.D;
        TextView textView = (TextView) gVar.h.findViewById(R.id.text1);
        if (textView != null) {
            textView.setTextAppearance(com.sportybet.android.gp.tz.R.style.InnerPaymentTabUnselected);
        }
    }
}
