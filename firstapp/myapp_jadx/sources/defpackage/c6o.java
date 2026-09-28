package defpackage;

import android.content.Context;
import android.graphics.Picture;
import android.net.Uri;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffDialogFragment$onSaveImageItemClicked$1", f = "InstantVirtualShowOffDialogFragment.kt", l = {129, 143}, m = "invokeSuspend", v = 2)
public final class c6o extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q5o c;
    public final /* synthetic */ Picture d;
    public final /* synthetic */ String e;

    public static final class a implements ee00 {
        public final /* synthetic */ q5o a;
        public final /* synthetic */ Uri b;
        public final /* synthetic */ File c;

        public a(q5o q5oVar, Uri uri, File file) {
            this.a = q5oVar;
            this.b = uri;
            this.c = file;
        }

        @Override // defpackage.ee00
        public final void onDenied() {
            q5o q5oVar = this.a;
            q5oVar.p0().show(R.string.common_functions__permission_denied);
            File file = this.c;
            try {
                zi50.a aVar = zi50.b;
                file.delete();
            } catch (Throwable unused) {
                zi50.a aVar2 = zi50.b;
            }
            q5oVar.q0().z1();
        }

        @Override // defpackage.ee00
        public final void onGranted() {
            boolean zD;
            q5o q5oVar = this.a;
            Context context = q5oVar.getContext();
            File file = this.c;
            if (context != null) {
                m7o m7oVarO0 = q5oVar.o0();
                String name = file.getName();
                name.getClass();
                zD = m7oVarO0.d((t6i0.a) context, this.b, name);
            } else {
                zD = false;
            }
            q5oVar.p0().show(zD ? R.string.common_feedback__successfully_saved : R.string.common_feedback__save_failed);
            try {
                zi50.a aVar = zi50.b;
                file.delete();
            } catch (Throwable unused) {
                zi50.a aVar2 = zi50.b;
            }
            q5oVar.q0().z1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6o(q5o q5oVar, Picture picture, String str, v1b<? super c6o> v1bVar) {
        super(2, v1bVar);
        this.c = q5oVar;
        this.d = picture;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c6o c6oVar = new c6o(this.c, this.d, this.e, v1bVar);
        c6oVar.b = obj;
        return c6oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c6o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r11 == r1) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
