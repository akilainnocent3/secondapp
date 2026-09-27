package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class h implements b, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Pattern f68250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f68251b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f68253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f68254e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f68252c = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Handler f68255f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.f68253d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.f68254e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f68254e, str);
        if (aVarA != null) {
            aVarA.f68224b = this.f68254e;
            return aVarA;
        }
        Matcher matcher = this.f68250a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f68228f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.f68226d = matcher.group(1);
                aVar.f68229g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.f68227e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.f68125k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.f68227e = com.mbridge.msdk.mbsignalcommon.base.e.f68125k.get(aVar.f68227e);
                }
                aVar.f68224b = this.f68254e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.f68251b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = aVar.f68225c;
                com.mbridge.msdk.mbsignalcommon.mapping.b.C0658b c0658b = aVar.f68223a;
                if (c0658b != null && obj != null) {
                    c0658b.a(obj, aVar, TextUtils.isEmpty(aVar.f68228f) ? JsonUtils.EMPTY_JSON : aVar.f68228f);
                }
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f68224b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f68226d);
        if (jsObject == null) {
            return;
        }
        try {
            com.mbridge.msdk.mbsignalcommon.mapping.b.C0658b c0658bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.f68253d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f68227e, Object.class, String.class);
            c0658bA.a();
            if (jsObject instanceof g) {
                aVar.f68223a = c0658bA;
                aVar.f68225c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void a(int i10, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = aVar;
        this.f68255f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.f68250a = pattern;
    }
}
