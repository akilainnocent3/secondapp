package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.e2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e2 f26527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26528b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a();

        void b();
    }

    public k(e2 e2Var, Context context) {
        super(context);
        this.f26527a = e2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f26528b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f26527a.b();
    }

    public void a(a aVar) {
        if (this.f26528b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f26527a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f26528b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
