package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.loader.music.MusicResourceBuilder", f = "MusicResourceBuilder.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "addResource", v = 1)
public final class wrw extends x1b {
    public String a;
    public String b;
    public tuw c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xrw e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrw(xrw xrwVar, x1b x1bVar) {
        super(x1bVar);
        this.e = xrwVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
