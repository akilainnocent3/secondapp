package com.bytedance.sdk.openadsdk.mrs.hww;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.hv.nod;
import com.bytedance.sdk.component.hv.ok;
import com.bytedance.sdk.component.hv.vhb;
import com.bytedance.sdk.component.hv.wgt;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.nod.vy;
import com.bytedance.sdk.openadsdk.utils.wdz;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.mrs.hww.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0384hww {
        void hww(int i10, String str, Throwable th2);

        void hww(String str, tq tqVar);
    }

    public void hww(com.bytedance.sdk.openadsdk.mrs.hww hwwVar, final InterfaceC0384hww interfaceC0384hww, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, kub kubVar) {
        nod nodVarHww = vy.hww(hwwVar.hww).hww(hwwVar.f37463tq).hww(i10).tq(i11).hv(wdz.hv(bs.hww())).vy(wdz.sd(bs.hww())).tq(str).hww(scaleType).hww(!TextUtils.isEmpty(str));
        if (i12 <= 0 || Build.VERSION.SDK_INT < 26) {
            nodVarHww.sd(1);
        } else {
            nodVarHww.sd(2).hww(new ok() { // from class: com.bytedance.sdk.openadsdk.mrs.hww.hww.1
                @Override // com.bytedance.sdk.component.hv.ok
                public Bitmap hww(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.vy.hww.hww(bs.hww(), bitmap, i12);
                }
            });
        }
        nodVarHww.hww(new com.bytedance.sdk.openadsdk.nod.tq(kubVar, hwwVar.hww, new wgt() { // from class: com.bytedance.sdk.openadsdk.mrs.hww.hww.2
            @Override // com.bytedance.sdk.component.hv.wgt
            public void hww(vhb vhbVar) {
                hww.this.hww(vhbVar, interfaceC0384hww);
            }

            @Override // com.bytedance.sdk.component.hv.wgt
            public void hww(int i13, String str2, Throwable th2) {
                hww.this.hww(i13, str2, th2, interfaceC0384hww);
            }
        }));
    }

    public void hww(vhb vhbVar, InterfaceC0384hww interfaceC0384hww) {
        if (interfaceC0384hww != null) {
            Object objTq = vhbVar.tq();
            int iHww = hww(vhbVar);
            if (objTq instanceof Drawable) {
                interfaceC0384hww.hww(vhbVar.hww(), new tq((Drawable) objTq, iHww));
                return;
            }
            if (objTq instanceof byte[]) {
                interfaceC0384hww.hww(vhbVar.hww(), new tq((byte[]) objTq, iHww));
                return;
            }
            if (objTq instanceof Bitmap) {
                interfaceC0384hww.hww(vhbVar.hww(), new tq((Bitmap) objTq, vhbVar.sd() instanceof Bitmap ? (Bitmap) vhbVar.sd() : null, iHww));
            } else {
                interfaceC0384hww.hww(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int hww(vhb vhbVar) {
        Object obj;
        Map<String, String> mapVy = vhbVar.vy();
        if (mapVy == null || (obj = mapVy.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void hww(int i10, String str, Throwable th2, InterfaceC0384hww interfaceC0384hww) {
        if (interfaceC0384hww != null) {
            interfaceC0384hww.hww(i10, str, th2);
        }
    }
}
