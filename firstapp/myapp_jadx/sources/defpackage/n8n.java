package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.presentation.util.ImageCaptureUtil", f = "ImageCaptureUtil.kt", l = {21, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "captureGraphicsLayerAndSave-yxL6bBk", v = 2)
public final class n8n extends x1b {
    public Context a;
    public String b;
    public String c;
    public Bitmap d;
    public /* synthetic */ Object e;
    public final /* synthetic */ p8n f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8n(p8n p8nVar, x1b x1bVar) {
        super(x1bVar);
        this.f = p8nVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        Object objA = this.f.a(null, null, null, null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
