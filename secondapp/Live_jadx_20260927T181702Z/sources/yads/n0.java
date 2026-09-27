package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds.l f152793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f152794b;

    public n0(pk3 pk3Var, View view) {
        super(view);
        this.f152793a = pk3Var;
        this.f152794b = (TextView) view.findViewById(R.id.item_button);
    }

    @Override // yads.ea0
    public final void a(final u90 u90Var) {
        TextView textView = this.f152794b;
        u90Var.getClass();
        textView.setText("Enable Test mode");
        this.f152794b.setOnClickListener(new View.OnClickListener() { // from class: yads.j64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.a(this.f150948b, u90Var, view);
            }
        });
    }

    public static final void a(n0 n0Var, u90 u90Var, View view) {
        ds.l lVar = n0Var.f152793a;
        u90Var.getClass();
        lVar.invoke(t90.TEST_MODE);
    }
}
