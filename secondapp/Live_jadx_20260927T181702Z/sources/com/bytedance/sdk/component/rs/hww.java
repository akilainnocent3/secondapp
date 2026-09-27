package com.bytedance.sdk.component.rs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.blh;
import com.bytedance.sdk.component.utils.mw;
import com.bytedance.sdk.component.utils.rs;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends sd implements mw.hww {

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private float f34989bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private int f34990ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final Context f34991hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final int f34992hv;
    private float jpb;
    private String mrs;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private long f34993ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private volatile float f34994ok;
    private View.OnTouchListener omn;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final int f34996sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final int f34997tq;
    private volatile float vgm;
    private long vhb;
    private final List<Integer> vy;
    private boolean wgt;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private float f34995rs = -1.0f;
    private float nod = -1.0f;
    private final Handler weu = new mw(rs.hww().getLooper(), this);
    InterfaceC0329hww hww = new InterfaceC0329hww() { // from class: com.bytedance.sdk.component.rs.hww.1
        @Override // com.bytedance.sdk.component.rs.hww.InterfaceC0329hww
        public void hww() {
            if (hww.this.f34995rs == -1.0f && hww.this.nod == -1.0f && hww.this.f34993ny == -1) {
                float unused = hww.this.f34995rs;
                float unused2 = hww.this.nod;
                hww hwwVar = hww.this;
                hwwVar.f34995rs = hwwVar.vgm;
                hww hwwVar2 = hww.this;
                hwwVar2.nod = hwwVar2.f34994ok;
                hww hwwVar3 = hww.this;
                hwwVar3.f34993ny = hwwVar3.vhb;
                hww.this.wgt = true;
            }
            float unused3 = hww.this.f34995rs;
            float unused4 = hww.this.nod;
        }

        @Override // com.bytedance.sdk.component.rs.hww.InterfaceC0329hww
        public void hww(int i10) {
            hww.this.f34990ed = i10;
            hww.this.tq();
        }
    };
    private int hnv = -1;
    private final List<Integer> khx = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.rs.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0329hww {
        void hww();

        void hww(int i10);
    }

    public hww(Context context, int i10, int i11, List<Integer> list, int i12) {
        this.f34991hu = context;
        if (i10 == -1) {
            this.f34997tq = blh.hww(context);
        } else {
            this.f34997tq = blh.hww(context, i10);
        }
        this.f34996sd = blh.hww(context, i11);
        this.vy = list;
        this.f34992hv = i12;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        hww hwwVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.vhb = SystemClock.elapsedRealtime();
        this.vgm = x10;
        this.f34994ok = y10;
        if (action == 0) {
            hwwVar = this;
            hwwVar.f34989bs = x10;
            hwwVar.jpb = y10;
        } else if (action != 1) {
            hwwVar = this;
        } else {
            hwwVar = this;
            if (hwwVar.hww(x10, y10, this.f34989bs, this.jpb, this.f34991hu)) {
                int iHww = hww(hwwVar.vgm, hwwVar.f34994ok, hwwVar.vhb);
                boolean zContains = hwwVar.khx.contains(Integer.valueOf(hwwVar.f34990ed));
                hww(view, motionEvent, iHww, !zContains);
                if (!zContains) {
                    hwwVar.khx.add(Integer.valueOf(hwwVar.f34990ed));
                }
                if (iHww == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = hwwVar.omn;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tq() {
        this.f34995rs = -1.0f;
        this.nod = -1.0f;
        this.f34993ny = -1L;
    }

    @Override // com.bytedance.sdk.component.rs.sd
    public void hww(View.OnTouchListener onTouchListener) {
        this.omn = onTouchListener;
    }

    public InterfaceC0329hww hww() {
        return this.hww;
    }

    private void hww(View view, MotionEvent motionEvent, int i10, boolean z10) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i10 == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z10 ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i10);
        jSONObject.put("current_url_index", this.f34990ed);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.weu.sendMessageDelayed(messageObtain, 200L);
    }

    public void hww(String str) {
        this.mrs = str;
    }

    private int hww(float f10, float f11, long j10) {
        if (this.f34995rs == -1.0f && this.nod == -1.0f && this.f34993ny == -1) {
            return 1;
        }
        if (!this.vy.contains(Integer.valueOf(this.f34990ed))) {
            return 2;
        }
        if (j10 - this.f34993ny > this.f34992hv) {
            tq();
            return 3;
        }
        float fAbs = Math.abs(f10 - this.f34995rs);
        float fAbs2 = Math.abs(f11 - this.nod);
        if (fAbs <= this.f34997tq / 2.0f && fAbs2 <= this.f34996sd / 2.0f) {
            return 0;
        }
        tq();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.mw.hww
    public void hww(Message message) {
        int i10 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i10 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.wgt ? 1 : 0);
                    this.wgt = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.rs.hww.hww.hww().tq() != null) {
                com.bytedance.sdk.component.rs.hww.hww.hww().tq().hww(this.mrs, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
