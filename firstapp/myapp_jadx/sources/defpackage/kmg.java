package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.roomcache.SportyBetCacheDB;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class kmg {
    public final SportyBetCacheDB a;
    public final uqm b;
    public final mpe0 c;

    public kmg(SportyBetCacheDB sportyBetCacheDB, uqm uqmVar) {
        sportyBetCacheDB.getClass();
        uqmVar.getClass();
        this.a = sportyBetCacheDB;
        this.b = uqmVar;
        this.c = hwr.b(new rlg(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        slg slgVar;
        if (x1bVar instanceof slg) {
            slgVar = (slg) x1bVar;
            int i = slgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                slgVar.c = i - Integer.MIN_VALUE;
            } else {
                slgVar = new slg(this, x1bVar);
            }
        } else {
            slgVar = new slg(this, x1bVar);
        }
        Object objD = slgVar.a;
        y5b y5bVar = y5b.a;
        int i2 = slgVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            tlg tlgVar = new tlg(this, str, null);
            slgVar.c = 1;
            objD = ej5.d(oddVar, tlgVar, slgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        ulg ulgVar;
        if (x1bVar instanceof ulg) {
            ulgVar = (ulg) x1bVar;
            int i = ulgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ulgVar.c = i - Integer.MIN_VALUE;
            } else {
                ulgVar = new ulg(this, x1bVar);
            }
        } else {
            ulgVar = new ulg(this, x1bVar);
        }
        Object objD = ulgVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ulgVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            vlg vlgVar = new vlg(this, null);
            ulgVar.c = 1;
            objD = ej5.d(oddVar, vlgVar, ulgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, x1b x1bVar) {
        wlg wlgVar;
        if (x1bVar instanceof wlg) {
            wlgVar = (wlg) x1bVar;
            int i = wlgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wlgVar.c = i - Integer.MIN_VALUE;
            } else {
                wlgVar = new wlg(this, x1bVar);
            }
        } else {
            wlgVar = new wlg(this, x1bVar);
        }
        Object objD = wlgVar.a;
        y5b y5bVar = y5b.a;
        int i2 = wlgVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            xlg xlgVar = new xlg(this, str, null);
            wlgVar.c = 1;
            objD = ej5.d(oddVar, xlgVar, wlgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(int i, x1b x1bVar, String str, String str2) {
        ylg ylgVar;
        if (x1bVar instanceof ylg) {
            ylgVar = (ylg) x1bVar;
            int i2 = ylgVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ylgVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ylgVar = new ylg(this, x1bVar);
            }
        } else {
            ylgVar = new ylg(this, x1bVar);
        }
        Object objD = ylgVar.a;
        y5b y5bVar = y5b.a;
        int i3 = ylgVar.c;
        if (i3 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            zlg zlgVar = new zlg(this, str, str2, i, null);
            ylgVar.c = 1;
            objD = ej5.d(oddVar, zlgVar, ylgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(int i, x1b x1bVar, String str) {
        amg amgVar;
        if (x1bVar instanceof amg) {
            amgVar = (amg) x1bVar;
            int i2 = amgVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                amgVar.c = i2 - Integer.MIN_VALUE;
            } else {
                amgVar = new amg(this, x1bVar);
            }
        } else {
            amgVar = new amg(this, x1bVar);
        }
        Object objD = amgVar.a;
        y5b y5bVar = y5b.a;
        int i3 = amgVar.c;
        if (i3 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            bmg bmgVar = new bmg(this, str, i, null);
            amgVar.c = 1;
            objD = ej5.d(oddVar, bmgVar, amgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }

    public final dlg f() {
        return (dlg) this.c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(x1b x1bVar, String str, List list) {
        cmg cmgVar;
        if (x1bVar instanceof cmg) {
            cmgVar = (cmg) x1bVar;
            int i = cmgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cmgVar.c = i - Integer.MIN_VALUE;
            } else {
                cmgVar = new cmg(this, x1bVar);
            }
        } else {
            cmgVar = new cmg(this, x1bVar);
        }
        Object objD = cmgVar.a;
        y5b y5bVar = y5b.a;
        int i2 = cmgVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            dmg dmgVar = new dmg(this, str, list, null);
            cmgVar.c = 1;
            objD = ej5.d(oddVar, dmgVar, cmgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Event event, int i, x1b x1bVar) {
        emg emgVar;
        if (x1bVar instanceof emg) {
            emgVar = (emg) x1bVar;
            int i2 = emgVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                emgVar.c = i2 - Integer.MIN_VALUE;
            } else {
                emgVar = new emg(this, x1bVar);
            }
        } else {
            emgVar = new emg(this, x1bVar);
        }
        Object objD = emgVar.a;
        y5b y5bVar = y5b.a;
        int i3 = emgVar.c;
        if (i3 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            fmg fmgVar = new fmg(this, event, i, null);
            emgVar.c = 1;
            objD = ej5.d(oddVar, fmgVar, emgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, int i, List list, x1b x1bVar) {
        gmg gmgVar;
        if (x1bVar instanceof gmg) {
            gmgVar = (gmg) x1bVar;
            int i2 = gmgVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gmgVar.c = i2 - Integer.MIN_VALUE;
            } else {
                gmgVar = new gmg(this, x1bVar);
            }
        } else {
            gmgVar = new gmg(this, x1bVar);
        }
        Object objD = gmgVar.a;
        y5b y5bVar = y5b.a;
        int i3 = gmgVar.c;
        if (i3 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            hmg hmgVar = new hmg(this, str, i, list, null);
            gmgVar.c = 1;
            objD = ej5.d(oddVar, hmgVar, gmgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, int i, List list, x1b x1bVar) {
        img imgVar;
        if (x1bVar instanceof img) {
            imgVar = (img) x1bVar;
            int i2 = imgVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imgVar.c = i2 - Integer.MIN_VALUE;
            } else {
                imgVar = new img(this, x1bVar);
            }
        } else {
            imgVar = new img(this, x1bVar);
        }
        Object objD = imgVar.a;
        y5b y5bVar = y5b.a;
        int i3 = imgVar.c;
        if (i3 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            jmg jmgVar = new jmg(this, str, i, list, null);
            imgVar.c = 1;
            objD = ej5.d(oddVar, jmgVar, imgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }
}
