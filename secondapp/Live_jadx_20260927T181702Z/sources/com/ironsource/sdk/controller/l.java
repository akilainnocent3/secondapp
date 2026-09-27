package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4523t8;
import com.ironsource.InterfaceC4570w4;
import com.ironsource.InterfaceC4587x4;
import com.ironsource.InterfaceC4604y4;
import com.ironsource.Nb;
import com.ironsource.Y4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface l {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(@oy.l f.a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(@oy.l Nb nb2);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(Y4 y10);

    void a(Y4 y10, Map<String, String> map, InterfaceC4570w4 interfaceC4570w4);

    void a(Y4 y10, Map<String, String> map, InterfaceC4587x4 interfaceC4587x4);

    void a(f.c cVar, @oy.m a aVar);

    void a(String str, InterfaceC4587x4 interfaceC4587x4);

    void a(String str, String str2, Y4 y10, InterfaceC4570w4 interfaceC4570w4);

    void a(String str, String str2, Y4 y10, InterfaceC4587x4 interfaceC4587x4);

    void a(String str, String str2, Y4 y10, InterfaceC4604y4 interfaceC4604y4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC4570w4 interfaceC4570w4);

    void a(JSONObject jSONObject, InterfaceC4587x4 interfaceC4587x4);

    void a(JSONObject jSONObject, InterfaceC4604y4 interfaceC4604y4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(Y4 y10);

    void b(Y4 y10, Map<String, String> map, InterfaceC4587x4 interfaceC4587x4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C4523t8.c h();
}
