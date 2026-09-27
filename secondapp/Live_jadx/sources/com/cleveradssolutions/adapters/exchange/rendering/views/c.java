package com.cleveradssolutions.adapters.exchange.rendering.views;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class c extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f42851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f42852c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        MUTED,
        UN_MUTED
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(a aVar);
    }

    public c(Context context, a aVar) {
        super(context);
        this.f42851b = a.MUTED;
        c(aVar);
        e();
    }

    public void b() {
        c(a.MUTED);
    }

    public final void c(a aVar) {
        this.f42851b = aVar;
        g(aVar);
        b bVar = this.f42852c;
        if (bVar != null) {
            bVar.a(this.f42851b);
        }
    }

    public void d() {
        c(a.UN_MUTED);
    }

    public final void e() {
        setOnClickListener(new View.OnClickListener() { // from class: com.cleveradssolutions.adapters.exchange.rendering.views.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42814b.f(view);
            }
        });
    }

    public final /* synthetic */ void f(View view) {
        if (this.f42851b == a.MUTED) {
            d();
        } else {
            b();
        }
    }

    public void g(a aVar) {
        setImageResource(aVar == a.MUTED ? com.cleveradssolutions.adapters.exchange.a.C0420a.f41992b : com.cleveradssolutions.adapters.exchange.a.C0420a.f41993c);
    }

    public void setVolumeControlListener(b bVar) {
        this.f42852c = bVar;
    }
}
