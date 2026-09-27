package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d implements b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f65974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f65975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f65976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicBoolean f65978e = new AtomicBoolean(false);

    public d(String str, String str2, View view, int i10) {
        this.f65976c = view;
        this.f65974a = str;
        this.f65975b = str2;
        this.f65977d = i10;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("mbridge_")) {
            return false;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.c.valueOf(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public View a() {
        return this.f65976c;
    }

    @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
    public void a(String str, Object obj) {
        if (b(this.f65974a)) {
            a(String.valueOf(obj));
        } else {
            b(str, obj);
        }
    }

    private void b(String str, Object obj) {
        KeyEvent.Callback callback = this.f65976c;
        if (callback instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
            ((com.mbridge.msdk.config.dynamic.baseview.inter.a) callback).updateBindData(str, obj);
        }
    }

    private void a(String str) {
        View view;
        if (this.f65978e.get() || (view = this.f65976c) == null) {
            return;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.a.a(view, this.f65974a, this.f65975b, str);
        } catch (Exception e10) {
            q0.b("ViewObserverImpl", e10.getMessage());
        }
    }
}
