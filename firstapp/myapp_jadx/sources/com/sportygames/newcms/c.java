package com.sportygames.newcms;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportygames.newcms.c;
import defpackage.bp5;
import defpackage.c0d;
import defpackage.co5;
import defpackage.dp5;
import defpackage.gp5;
import defpackage.hna;
import defpackage.ibs;
import defpackage.ndt;
import defpackage.op8;
import defpackage.pp8;
import defpackage.pwo;
import defpackage.qyd0;
import defpackage.s9s;
import defpackage.tje0;
import defpackage.tse;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.use;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vrw;
import defpackage.xvf;
import defpackage.y5b;
import defpackage.ytw;
import defpackage.zi50;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static final qyd0 a = new qyd0(new bp5(0));

    @c0d(c = "com.sportygames.newcms.CMSResourceKt$PlayBackgroundMusic$1$1", f = "CMSResource.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ ytw<MediaPlayer> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, ytw ytwVar, Context context, String str) {
            super(2, v1bVar);
            this.b = ytwVar;
            this.c = str;
            this.d = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            String str = this.c;
            a aVar = new a(v1bVar, this.b, this.d, str);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ytw<MediaPlayer> ytwVar = this.b;
            try {
                zi50.a aVar = zi50.b;
                qyd0 qyd0Var = c.a;
                MediaPlayer value = ytwVar.getValue();
                if (value != null) {
                    value.stop();
                    Unit unit = Unit.a;
                }
            } catch (Throwable unused) {
                zi50.a aVar2 = zi50.b;
            }
            try {
                qyd0 qyd0Var2 = c.a;
                MediaPlayer value2 = ytwVar.getValue();
                if (value2 != null) {
                    value2.release();
                    Unit unit2 = Unit.a;
                }
            } catch (Throwable unused2) {
                zi50.a aVar3 = zi50.b;
            }
            Context context = this.d;
            String str = this.c;
            if (str != null) {
                try {
                    Uri uri = Uri.parse(str);
                    if (uri != null) {
                        MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, uri);
                        qyd0 qyd0Var3 = c.a;
                        ytwVar.setValue(mediaPlayerCreate);
                        MediaPlayer value3 = ytwVar.getValue();
                        if (value3 != null) {
                            value3.setLooping(true);
                        }
                        MediaPlayer value4 = ytwVar.getValue();
                        if (value4 != null) {
                            value4.start();
                            Unit unit3 = Unit.a;
                        }
                        return Unit.a;
                    }
                } catch (Throwable unused3) {
                    zi50.a aVar4 = zi50.b;
                }
            }
            return Unit.a;
        }
    }

    public static final class b implements tse {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ gp5 b;
        public final /* synthetic */ ytw c;

        public b(ytw ytwVar, gp5 gp5Var, use useVar, ytw ytwVar2) {
            this.a = ytwVar;
            this.b = gp5Var;
            this.c = ytwVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.tse
        public final void dispose() {
            ((ibs) this.a.getValue()).getLifecycle().d(this.b);
            try {
                zi50.a aVar = zi50.b;
                MediaPlayer mediaPlayer = (MediaPlayer) this.c.getValue();
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                    Unit unit = Unit.a;
                }
            } catch (Throwable unused) {
                zi50.a aVar2 = zi50.b;
            }
        }
    }

    /* JADX INFO: renamed from: com.sportygames.newcms.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C0442c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s9s.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(com.sportygames.newcms.b bVar, final op8 op8Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        bVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-800445580);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            hna.a(a.a(bVar), pp8.b(-1604493644, new Function2() { // from class: cp5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        op8Var.invoke(aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new dp5(bVar, op8Var, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    public static final void b(final CMSRes cMSRes, androidx.compose.runtime.a aVar, final int i) {
        co5 next;
        cMSRes.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1609149143);
        int i2 = (bVarI.M(cMSRes) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) bVarI.O(a);
            final ytw ytwVarC = m.c(bVarI.O(ndt.a), bVarI);
            boolean zM = bVarI.M(bVar) | ((i2 & 14) == 4);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                bVar.getClass();
                Iterator<co5> it = bVar.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof vrw));
                co5 co5Var = next;
                if (co5Var == null) {
                    objY = null;
                } else {
                    vrw vrwVar = co5Var instanceof vrw ? (vrw) co5Var : null;
                    if (vrwVar == null) {
                        objY = null;
                    } else {
                        String strB = bVar.b(cMSRes, "");
                        if (StringsKt.U(strB)) {
                            strB = null;
                        }
                        if (strB != null) {
                            objY = vrwVar.a.get(strB);
                        } else {
                            objY = null;
                        }
                    }
                }
                bVarI.r(objY);
            }
            String str = (String) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            final ytw ytwVar = (ytw) objY2;
            boolean zM2 = bVarI.M(str) | bVarI.A(context);
            Object objY3 = bVarI.y();
            if (zM2 || objY3 == c0042a) {
                objY3 = new a(null, ytwVar, context, str);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, str, (Function2) objY3);
            T value = ytwVarC.getValue();
            boolean zM3 = bVarI.M(ytwVarC);
            Object objY4 = bVarI.y();
            if (zM3 || objY4 == c0042a) {
                objY4 = new Function1() { // from class: ep5
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [gp5, hbs] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        use useVar = (use) obj;
                        useVar.getClass();
                        ytw ytwVar2 = ytwVar;
                        ?? r0 = new cbs(useVar, ytwVar2) { // from class: gp5
                            public final /* synthetic */ ytw a;

                            {
                                this.a = ytwVar2;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar, s9s.a aVar2) {
                                int i3 = c.C0442c.a[aVar2.ordinal()];
                                ytw ytwVar3 = this.a;
                                if (i3 == 1) {
                                    try {
                                        zi50.a aVar3 = zi50.b;
                                        MediaPlayer mediaPlayer = (MediaPlayer) ytwVar3.getValue();
                                        if (mediaPlayer != null) {
                                            mediaPlayer.start();
                                            Unit unit = Unit.a;
                                            return;
                                        }
                                        return;
                                    } catch (Throwable unused) {
                                        zi50.a aVar4 = zi50.b;
                                        return;
                                    }
                                }
                                if (i3 == 2) {
                                    try {
                                        zi50.a aVar5 = zi50.b;
                                        MediaPlayer mediaPlayer2 = (MediaPlayer) ytwVar3.getValue();
                                        if (mediaPlayer2 != null) {
                                            mediaPlayer2.pause();
                                            Unit unit2 = Unit.a;
                                            return;
                                        }
                                        return;
                                    } catch (Throwable unused2) {
                                        zi50.a aVar6 = zi50.b;
                                        return;
                                    }
                                }
                                if (i3 != 3) {
                                    return;
                                }
                                try {
                                    zi50.a aVar7 = zi50.b;
                                    MediaPlayer mediaPlayer3 = (MediaPlayer) ytwVar3.getValue();
                                    if (mediaPlayer3 != null) {
                                        mediaPlayer3.release();
                                        Unit unit3 = Unit.a;
                                    }
                                } catch (Throwable unused3) {
                                    zi50.a aVar8 = zi50.b;
                                }
                                ytwVar3.setValue(null);
                            }
                        };
                        ytw ytwVar3 = ytwVarC;
                        ((ibs) ytwVar3.getValue()).getLifecycle().a(r0);
                        return new c.b(ytwVar3, r0, useVar, ytwVar2);
                    }
                };
                bVarI.r(objY4);
            }
            xvf.c(value, (Function1) objY4, bVarI);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: fp5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String c(CMSRes cMSRes, String[] strArr, androidx.compose.runtime.a aVar) {
        String str;
        Integer numValueOf;
        Object bVar;
        cMSRes.getClass();
        String strE = e((com.sportygames.newcms.b) aVar.O(a), cMSRes, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (strE == null) {
            aVar.N(-261497755);
            Object obj = null;
            if (cMSRes instanceof CMSRes.Data) {
                numValueOf = ((CMSRes.Data) cMSRes).f;
            } else if (cMSRes instanceof CMSRes.Id) {
                numValueOf = null;
            } else {
                if (!(cMSRes instanceof CMSRes.IdWithDefault)) {
                    uhc.a();
                    return null;
                }
                numValueOf = Integer.valueOf(((CMSRes.IdWithDefault) cMSRes).c);
            }
            if (numValueOf == null) {
                aVar.N(-261497756);
            } else {
                aVar.N(-261497755);
                int iIntValue = numValueOf.intValue();
                aVar.N(545754089);
                try {
                    zi50.a aVar2 = zi50.b;
                    bVar = pwo.f(iIntValue, Arrays.copyOf(strArr, strArr.length), aVar);
                } catch (Throwable th) {
                    zi50.a aVar3 = zi50.b;
                    bVar = new zi50.b(th);
                }
                aVar.H();
                obj = (String) (bVar instanceof zi50.b ? null : bVar);
            }
            aVar.H();
            str = obj;
            aVar.H();
        } else {
            aVar.N(545748895);
            aVar.H();
        }
        if (str == 0) {
            str = strE;
            return "";
        }
        str = strE;
        return str;
    }

    public static final String d(CMSRes cMSRes, String str, androidx.compose.runtime.a aVar) {
        cMSRes.getClass();
        str.getClass();
        String strE = e((com.sportygames.newcms.b) aVar.O(a), cMSRes, new String[0]);
        return strE == null ? str : strE;
    }

    public static final String e(com.sportygames.newcms.b bVar, CMSRes cMSRes, String... strArr) {
        CMSRes.Id id;
        Object bVar2;
        bVar.getClass();
        cMSRes.getClass();
        if (cMSRes instanceof CMSRes.Data) {
            CMSRes.Data data = (CMSRes.Data) cMSRes;
            id = new CMSRes.Id(data.a, data.b);
        } else if (cMSRes instanceof CMSRes.Id) {
            id = (CMSRes.Id) cMSRes;
        } else {
            if (!(cMSRes instanceof CMSRes.IdWithDefault)) {
                uhc.a();
                return null;
            }
            CMSRes.IdWithDefault idWithDefault = (CMSRes.IdWithDefault) cMSRes;
            id = new CMSRes.Id(idWithDefault.a, idWithDefault.b);
        }
        String str = bVar.a.get(id);
        if (str == null) {
            return null;
        }
        if (strArr.length == 0) {
            return str;
        }
        try {
            zi50.a aVar = zi50.b;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            bVar2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar2 = new zi50.b(th);
        }
        return (String) (bVar2 instanceof zi50.b ? null : bVar2);
    }
}
