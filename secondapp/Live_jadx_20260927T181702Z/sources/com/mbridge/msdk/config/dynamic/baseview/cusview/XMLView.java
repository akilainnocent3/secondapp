package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class XMLView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, View> f65866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.inter.a f65867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.config.dynamic.baseview.touch.a f65869d;

    public XMLView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65866a = new HashMap();
        this.f65868c = "";
        this.f65869d = new com.mbridge.msdk.config.dynamic.baseview.touch.a();
        a();
    }

    private void a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f65869d.c();
                this.f65869d.d(motionEvent);
            } else if (action == 1) {
                this.f65869d.f(motionEvent);
            } else if (action == 2) {
                this.f65869d.e(motionEvent);
            } else if (action == 3) {
                this.f65869d.c(motionEvent);
            }
        } catch (Exception e10) {
            q0.b("RenderView", "处理触摸事件异常: " + e10.getMessage());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Map<String, View> getRenderMap() {
        return this.f65866a;
    }

    public String getSelfTag() {
        return this.f65868c;
    }

    public com.mbridge.msdk.config.dynamic.baseview.touch.a getTouchEventData() {
        return this.f65869d;
    }

    public com.mbridge.msdk.config.component.style.inter.a getXmlViewActionListener() {
        return this.f65867b;
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f65868c = SameMD5.getMD5(str);
    }

    public void setXmlViewActionListener(com.mbridge.msdk.config.component.style.inter.a aVar) {
        this.f65867b = aVar;
    }

    public void updateTouchView(View view) {
        com.mbridge.msdk.config.dynamic.baseview.touch.a aVar = this.f65869d;
        if (aVar != null) {
            aVar.c(view);
        }
    }
}
