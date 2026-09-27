package androidx.leanback.widget;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class i0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f12662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f12663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f12664e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f12667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Drawable f12668d;

        public a(String str, String str2, String str3, Drawable drawable) {
            this.f12667c = str3;
            this.f12665a = str;
            this.f12666b = str2;
            this.f12668d = drawable;
        }

        public String a() {
            return this.f12667c;
        }

        public String b() {
            return this.f12666b;
        }

        public Drawable c() {
            return this.f12668d;
        }

        public String d() {
            return this.f12665a;
        }
    }

    public TextView c() {
        return this.f12662c;
    }

    public TextView d() {
        return this.f12661b;
    }

    public ImageView e() {
        return this.f12663d;
    }

    public TextView f() {
        return this.f12660a;
    }

    public View g(LayoutInflater layoutInflater, ViewGroup viewGroup, a aVar) {
        View viewInflate = layoutInflater.inflate(i(), viewGroup, false);
        this.f12660a = (TextView) viewInflate.findViewById(s3.a.h.f128736l0);
        this.f12662c = (TextView) viewInflate.findViewById(s3.a.h.f128720h0);
        this.f12661b = (TextView) viewInflate.findViewById(s3.a.h.f128728j0);
        this.f12663d = (ImageView) viewInflate.findViewById(s3.a.h.f128732k0);
        this.f12664e = viewInflate.findViewById(s3.a.h.f128724i0);
        TextView textView = this.f12660a;
        if (textView != null) {
            textView.setText(aVar.d());
        }
        TextView textView2 = this.f12662c;
        if (textView2 != null) {
            textView2.setText(aVar.a());
        }
        TextView textView3 = this.f12661b;
        if (textView3 != null) {
            textView3.setText(aVar.b());
        }
        if (this.f12663d != null) {
            if (aVar.c() != null) {
                this.f12663d.setImageDrawable(aVar.c());
            } else {
                this.f12663d.setVisibility(8);
            }
        }
        View view = this.f12664e;
        if (view != null && TextUtils.isEmpty(view.getContentDescription())) {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(aVar.a())) {
                sb2.append(aVar.a());
                sb2.append('\n');
            }
            if (!TextUtils.isEmpty(aVar.d())) {
                sb2.append(aVar.d());
                sb2.append('\n');
            }
            if (!TextUtils.isEmpty(aVar.b())) {
                sb2.append(aVar.b());
                sb2.append('\n');
            }
            this.f12664e.setContentDescription(sb2);
        }
        return viewInflate;
    }

    public void h() {
        this.f12662c = null;
        this.f12661b = null;
        this.f12663d = null;
        this.f12660a = null;
        this.f12664e = null;
    }

    public int i() {
        return s3.a.j.f128841p;
    }

    @Override // androidx.leanback.widget.e0
    public void a(List<Animator> list) {
    }

    @Override // androidx.leanback.widget.e0
    public void b(List<Animator> list) {
    }
}
