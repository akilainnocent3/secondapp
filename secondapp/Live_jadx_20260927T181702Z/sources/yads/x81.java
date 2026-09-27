package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x81 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f157716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj3 f157717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final za1 f157718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch3 f157719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oa2 f157720e;

    public /* synthetic */ x81(Context context, lu2 lu2Var, o00 o00Var, je3 je3Var, yj3 yj3Var, za1 za1Var, ch3 ch3Var) {
        this(je3Var, yj3Var, za1Var, ch3Var, new ja1(context, lu2Var, o00Var, je3Var));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f157717b.m();
        this.f157718c.i((ua1) this.f157716a.f151064d);
        String str = this.f157719d.f147736b;
        if (str == null || str.length() == 0) {
            return;
        }
        this.f157720e.a(str);
    }

    public x81(je3 je3Var, yj3 yj3Var, za1 za1Var, ch3 ch3Var, ja1 ja1Var) {
        this.f157716a = je3Var;
        this.f157717b = yj3Var;
        this.f157718c = za1Var;
        this.f157719d = ch3Var;
        this.f157720e = ja1Var.a();
    }
}
