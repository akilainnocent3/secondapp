package sg.bigo.ads.ad.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f131058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f131059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f131060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.a f131061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f131062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f131063f;

    public final void a() {
        n nVar = this.f131062e;
        if (nVar != null) {
            nVar.b();
            this.f131063f = false;
        }
    }

    public final void a(ViewGroup viewGroup, int i10, f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        this.f131063f = false;
        this.f131061d = aVar;
        this.f131060c = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_close_btn);
        this.f131058a = (TextView) viewGroup.findViewById(R.id.close_text);
        TextView textView = (TextView) viewGroup.findViewById(R.id.second_text);
        this.f131059b = textView;
        ViewGroup viewGroup2 = this.f131060c;
        if (viewGroup2 == null || this.f131058a == null || textView == null) {
            f.a aVar2 = this.f131061d;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.d.d.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.a aVar3 = d.this.f131061d;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
        });
        this.f131060c.setClickable(false);
        this.f131058a.setTextColor(1728053247);
        this.f131059b.setVisibility(0);
        n nVar = new n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.d.d.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                d dVar = d.this;
                dVar.f131063f = true;
                dVar.f131060c.setAlpha(1.0f);
                d.this.f131060c.setClickable(true);
                d.this.f131059b.setVisibility(8);
                d.this.f131058a.setTextColor(-1);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
                d.this.f131059b.setText(q.a("%ds", Integer.valueOf(Math.round(j10 / 1000.0f))));
            }
        };
        this.f131062e = nVar;
        nVar.c();
    }
}
