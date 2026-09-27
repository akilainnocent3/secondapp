package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected e.c f132962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    protected Map<String, Object> f132963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f132964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f132965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f132966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f132967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String[] f132968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Context f132969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected View f132970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected InterfaceC1345a f132971j;

    /* JADX INFO: renamed from: sg.bigo.ads.common.form.render.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1345a {
        void a(String str, String str2);
    }

    public a(@NonNull e.c cVar, @Nullable Map<String, Object> map, @NonNull Context context, InterfaceC1345a interfaceC1345a) {
        this.f132969h = context;
        this.f132962a = cVar;
        this.f132963b = map;
        this.f132965d = cVar.f132712a;
        this.f132966e = cVar.f132715d;
        this.f132967f = cVar.f132713b;
        this.f132968g = cVar.f132714c;
        this.f132971j = interfaceC1345a;
    }

    public void a(int i10) {
        int iA = sg.bigo.ads.common.form.render.a.a();
        int iB = sg.bigo.ads.common.form.render.a.b();
        boolean z10 = false;
        if (i10 != 2) {
            if (i10 == 3) {
                iA = -45718;
                z10 = true;
            }
            a(iA, iB, z10);
        }
        iA = -16736769;
        iB = iA;
        a(iA, iB, z10);
    }

    public abstract View b();

    public final View c() {
        return this.f132970i;
    }

    public final void a(int i10, int i11, boolean z10) {
        View view = this.f132970i;
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.inter_form_edit_content);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(this.f132969h, 1), i10);
            gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(this.f132969h, 8));
            viewFindViewById.setBackground(gradientDrawable);
        }
        TextView textView = (TextView) this.f132970i.findViewById(R.id.inter_form_edit_warning);
        if (textView != null) {
            textView.setText(sg.bigo.ads.common.form.a.a(this.f132969h, R.string.bigo_ad_form_warning));
            textView.setVisibility(z10 ? 0 : 8);
        }
        TextView textView2 = (TextView) this.f132970i.findViewById(R.id.inter_form_edit_title);
        if (textView2 != null) {
            textView2.setTextColor(i11);
        }
    }

    public static void a(TextView textView, @Nullable String str) {
        if (TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.setText(str);
    }

    public final boolean a() {
        boolean zA = q.a((CharSequence) this.f132964c);
        if (this.f132962a.f132713b == 3) {
            zA = !q.g(this.f132964c);
        }
        a(zA ? 3 : 1);
        return zA;
    }
}
