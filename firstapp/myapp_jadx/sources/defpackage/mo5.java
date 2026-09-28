package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class mo5 implements bo5<xrw> {
    public final Context a;

    public mo5(Context context) {
        context.getClass();
        this.a = context;
        nn5 nn5Var = nn5.String;
    }

    @Override // defpackage.bo5
    public final do5 b() {
        return new xrw();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, x1b x1bVar) throws Throwable {
        ho5 ho5Var;
        Object bVar;
        MediaPlayer mediaPlayer;
        if (x1bVar instanceof ho5) {
            ho5Var = (ho5) x1bVar;
            int i = ho5Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho5Var.d = i - Integer.MIN_VALUE;
            } else {
                ho5Var = new ho5(this, x1bVar);
            }
        } else {
            ho5Var = new ho5(this, x1bVar);
        }
        Object obj = ho5Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ho5Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            ho5Var.a = mediaPlayer2;
            ho5Var.d = 1;
            bc6 bc6Var = new bc6(1, yzo.b(ho5Var));
            bc6Var.q();
            try {
                zi50.a aVar = zi50.b;
                mediaPlayer2.setDataSource(this.a, Uri.parse(str));
                mediaPlayer2.setOnPreparedListener(new io5(bc6Var, this, mediaPlayer2));
                mediaPlayer2.setOnErrorListener(new jo5(bc6Var, this, mediaPlayer2));
                mediaPlayer2.prepareAsync();
                bVar = Unit.a;
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (zi50.a(bVar) != null) {
                bc6Var.resumeWith(Boolean.FALSE);
                try {
                    mediaPlayer2.release();
                    Unit unit = Unit.a;
                } catch (Throwable unused) {
                    zi50.a aVar3 = zi50.b;
                }
            }
            bc6Var.t(new ko5(this, mediaPlayer2));
            Object objO = bc6Var.o();
            y5b y5bVar2 = y5b.a;
            if (objO == y5bVar) {
                return y5bVar;
            }
            obj = objO;
            mediaPlayer = mediaPlayer2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mediaPlayer = ho5Var.a;
            uj50.b(obj);
        }
        Boolean bool = (Boolean) obj;
        bool.getClass();
        try {
            zi50.a aVar4 = zi50.b;
            mediaPlayer.release();
            Unit unit2 = Unit.a;
        } catch (Throwable unused2) {
            zi50.a aVar5 = zi50.b;
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fd, code lost:
    
        if (r14.a(r15, r3, r5) == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ba, code lost:
    
        if (r1.a(r2, r0, r5) == r6) goto L61;
     */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [com.sportygames.newcms.CMSRes$Data, java.io.File, java.lang.Object, java.lang.String, xrw] */
    /* JADX WARN: Type inference failed for: r8v17 */
    @Override // defpackage.bo5
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.sportygames.newcms.CMSRes.Data r18, java.lang.String r19, defpackage.xrw r20, defpackage.x1b r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo5.a(com.sportygames.newcms.CMSRes$Data, java.lang.String, xrw, x1b):java.lang.Object");
    }

    @Override // defpackage.bo5
    public final nn5 getType() {
        return nn5.LongMusic;
    }
}
