package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f70826d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f70827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f70828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f70829c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class RunnableC0707a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f70830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f70831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f70832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f70833d;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC0708a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.video.dynview.shape.a.b f70835a;

            public RunnableC0708a(com.mbridge.msdk.video.dynview.shape.a.b bVar) {
                this.f70835a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f70827a == null || this.f70835a.build() == null) {
                    return;
                }
                a.this.f70827a.setBackground(this.f70835a.build());
            }
        }

        public RunnableC0707a(Bitmap bitmap, int i10, float f10, float f11) {
            this.f70830a = bitmap;
            this.f70831b = i10;
            this.f70832c = f10;
            this.f70833d = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = a0.a(this.f70830a, 10);
                Bitmap bitmapA2 = a0.a(this.f70830a, 10);
                com.mbridge.msdk.video.dynview.shape.a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
                bVarA.orientation(this.f70831b).b(bitmapA).a(bitmapA2);
                if (this.f70831b == 2) {
                    float f10 = this.f70832c;
                    float f11 = this.f70833d;
                    if (f10 > f11) {
                        bVarA.b(f10).a(this.f70833d);
                    } else {
                        bVarA.b(f11).a(this.f70832c);
                    }
                } else {
                    bVarA.b(this.f70832c).a(this.f70833d);
                }
                if (a.this.f70827a != null) {
                    a.this.f70827a.post(new RunnableC0708a(bVarA));
                }
            } catch (Exception e10) {
                q0.b("ChoiceOneDrawBitBg", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public void b() {
        if (this.f70827a != null) {
            this.f70827a = null;
        }
        Bitmap bitmap = this.f70828b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f70828b.recycle();
            this.f70828b = null;
        }
        Bitmap bitmap2 = this.f70829c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f70829c.recycle();
        this.f70829c = null;
    }

    public static a a() {
        a aVar;
        if (f70826d != null) {
            return f70826d;
        }
        synchronized (a.class) {
            try {
                if (f70826d == null) {
                    f70826d = new a();
                }
                aVar = f70826d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f70827a = view;
        int iH = cVar.h();
        float fM = cVar.m();
        float fK = cVar.k();
        try {
            List<CampaignEx> listB = cVar.b();
            String md5 = listB.get(0) != null ? SameMD5.getMD5(listB.get(0).getImageUrl()) : "";
            String md6 = listB.get(1) != null ? SameMD5.getMD5(listB.get(1).getImageUrl()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            if (!TextUtils.isEmpty(md6) && map.containsKey(md6)) {
                bitmap = map.get(md6);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            a(iH, fM, fK, bitmap2, bitmap3);
        } catch (Exception e10) {
            q0.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    private synchronized void a(int i10, float f10, float f11, Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        try {
            try {
                try {
                    com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0707a(bitmap, i10, f10, f11));
                } catch (Exception e10) {
                    e = e10;
                    q0.a("ChoiceOneDrawBitBg", e.getMessage());
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
