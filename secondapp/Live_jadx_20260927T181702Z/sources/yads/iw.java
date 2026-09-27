package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class iw extends hk3 {
    public iw(TextView textView) {
        super(textView);
    }

    @Override // yads.hk3
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.f149260b == gwVar.f149800a) {
            textView.setText(gwVar.f149801b);
        }
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.f149260b == gwVar.f149800a) {
            return kotlin.jvm.internal.m0.g(textView.getText().toString(), gwVar.f149801b);
        }
        return true;
    }
}
