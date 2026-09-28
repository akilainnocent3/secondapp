package defpackage;

import android.content.Context;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.appsflyer.AppsFlyerProperties;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class ga implements dn20, ejt {
    public static final /* synthetic */ ohp<Object>[] s = {new d630(0, ga.class, "lastAccount", "getLastAccount()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "lastUserId", "getLastUserId()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "lastAvatarUrl", "getLastAvatarUrl()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "lastNickname", "getLastNickname()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "loginType", "getLoginType()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "currentUserId", "getCurrentUserId()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "countryCode", "getCountryCode()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, AppsFlyerProperties.CURRENCY_CODE, LhMGMAwwhzjwfz.cvh), new d630(0, ga.class, "phoneCountryCode", "getPhoneCountryCode()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "userCertStatus", "getUserCertStatus()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "documentAuditStatus", "getDocumentAuditStatus()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "kycHintRejectTitle", "getKycHintRejectTitle()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "kycHintRejectReason", "getKycHintRejectReason()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "selfExclusion", "getSelfExclusion()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "selfExclusionType", yFmFZvuWxAYfEj.tmVkJ), new d630(0, ga.class, "loginTime", "getLoginTime()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "isTwoFactorAuthEnabled", "isTwoFactorAuthEnabled()Lcom/sportybet/core/datastore/Preference;"), new d630(0, ga.class, "hasVisitedTwoFactorAuthPage", "getHasVisitedTwoFactorAuthPage()Lcom/sportybet/core/datastore/Preference;")};
    public final /* synthetic */ zed a;
    public final rkd b = new rkd("lastAccount", jq40.a(String.class), this);
    public final rkd c = new rkd("lastUserId", jq40.a(String.class), this);
    public final rkd d = new rkd("lastAvatarUrl", jq40.a(String.class), this);
    public final rkd e = new rkd("lastNickname", jq40.a(String.class), this);
    public final rkd f = new rkd("loginType", jq40.a(String.class), this);
    public final rkd g = new rkd("userId", jq40.a(String.class), this);
    public final rkd h = new rkd("country_code", jq40.a(String.class), this);
    public final rkd i = new rkd("currency_code", jq40.a(String.class), this);
    public final rkd j;
    public final rkd k;
    public final rkd l;
    public final rkd m;
    public final rkd n;
    public final rkd o;
    public final rkd p;
    public final rkd q;
    public final rkd r;

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.datastore.AccountPreferencesDataStore", f = "AccountPreferencesDataStore.kt", l = {69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80}, m = "clearUserData", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ga.this.clearUserData(this);
        }
    }

    public ga(Context context) {
        this.a = new zed(ia.b.a(context, ia.a[0]));
        jq40.a(String.class);
        this.j = new rkd("first_deposit_confirm_name", jq40.a(Integer.class), this);
        this.k = new rkd("document_audit_status", jq40.a(Integer.class), this);
        this.l = new rkd("kyc_hint_reject_title", jq40.a(String.class), this);
        this.m = new rkd("kyc_hint_reject_reason", jq40.a(String.class), this);
        this.n = new rkd("self_exclusion", jq40.a(Long.class), this);
        this.o = new rkd("self_exclusion_type", jq40.a(String.class), this);
        this.p = new rkd("login_time", jq40.a(Long.class), this);
        this.q = new rkd("is2FAEnable", jq40.a(Boolean.class), this);
        this.r = new rkd("hasCheckedTwoFAPage", jq40.a(Boolean.class), this);
    }

    public final wm20<Boolean> a() {
        return this.r.a(this, s[17]);
    }

    public final wm20<String> b() {
        return this.m.a(this, s[12]);
    }

    public final wm20<String> c() {
        return this.l.a(this, s[11]);
    }

    @Override // defpackage.dn20
    public final <T> Object clearPreference(zn20.a<T> aVar, v1b<? super Unit> v1bVar) {
        return this.a.clearPreference(aVar, v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:58:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ejt
    public final Object clearUserData(v1b<? super Unit> v1bVar) {
        a aVar;
        wm20 wm20VarA;
        wm20 wm20VarA2;
        wm20 wm20VarA3;
        wm20 wm20VarA4;
        wm20 wm20VarA5;
        wm20 wm20VarA6;
        wm20 wm20VarA7;
        wm20 wm20VarA8;
        wm20<String> wm20VarC;
        wm20<String> wm20VarB;
        Object objA;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        ohp<?>[] ohpVarArr = s;
        switch (i2) {
            case 0:
                uj50.b(obj);
                wm20 wm20VarA9 = this.f.a(this, ohpVarArr[4]);
                aVar.c = 1;
                if (wm20VarA9.a(aVar) != y5bVar) {
                    wm20VarA = this.g.a(this, ohpVarArr[5]);
                    aVar.c = 2;
                    if (wm20VarA.a(aVar) != y5bVar) {
                        wm20VarA2 = this.e.a(this, ohpVarArr[3]);
                        aVar.c = 3;
                        if (wm20VarA2.a(aVar) != y5bVar) {
                            wm20VarA3 = this.d.a(this, ohpVarArr[2]);
                            aVar.c = 4;
                            if (wm20VarA3.a(aVar) != y5bVar) {
                                wm20VarA4 = this.n.a(this, ohpVarArr[13]);
                                aVar.c = 5;
                                if (wm20VarA4.a(aVar) != y5bVar) {
                                    wm20VarA5 = this.o.a(this, ohpVarArr[14]);
                                    aVar.c = 6;
                                    if (wm20VarA5.a(aVar) != y5bVar) {
                                        wm20VarA6 = this.p.a(this, ohpVarArr[15]);
                                        aVar.c = 7;
                                        if (wm20VarA6.a(aVar) != y5bVar) {
                                            wm20VarA7 = this.j.a(this, ohpVarArr[9]);
                                            aVar.c = 8;
                                            if (wm20VarA7.a(aVar) != y5bVar) {
                                                wm20VarA8 = this.k.a(this, ohpVarArr[10]);
                                                aVar.c = 9;
                                                if (wm20VarA8.a(aVar) != y5bVar) {
                                                    wm20VarC = c();
                                                    aVar.c = 10;
                                                    if (wm20VarC.a(aVar) != y5bVar) {
                                                        wm20VarB = b();
                                                        aVar.c = 11;
                                                        if (wm20VarB.a(aVar) != y5bVar) {
                                                            wm20 wm20VarA10 = this.i.a(this, ohpVarArr[7]);
                                                            aVar.c = 12;
                                                            objA = wm20VarA10.a(aVar);
                                                            if (objA != y5bVar) {
                                                                return objA;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 1:
                uj50.b(obj);
                wm20VarA = this.g.a(this, ohpVarArr[5]);
                aVar.c = 2;
                if (wm20VarA.a(aVar) != y5bVar) {
                    wm20VarA2 = this.e.a(this, ohpVarArr[3]);
                    aVar.c = 3;
                    if (wm20VarA2.a(aVar) != y5bVar) {
                        wm20VarA3 = this.d.a(this, ohpVarArr[2]);
                        aVar.c = 4;
                        if (wm20VarA3.a(aVar) != y5bVar) {
                            wm20VarA4 = this.n.a(this, ohpVarArr[13]);
                            aVar.c = 5;
                            if (wm20VarA4.a(aVar) != y5bVar) {
                                wm20VarA5 = this.o.a(this, ohpVarArr[14]);
                                aVar.c = 6;
                                if (wm20VarA5.a(aVar) != y5bVar) {
                                    wm20VarA6 = this.p.a(this, ohpVarArr[15]);
                                    aVar.c = 7;
                                    if (wm20VarA6.a(aVar) != y5bVar) {
                                        wm20VarA7 = this.j.a(this, ohpVarArr[9]);
                                        aVar.c = 8;
                                        if (wm20VarA7.a(aVar) != y5bVar) {
                                            wm20VarA8 = this.k.a(this, ohpVarArr[10]);
                                            aVar.c = 9;
                                            if (wm20VarA8.a(aVar) != y5bVar) {
                                                wm20VarC = c();
                                                aVar.c = 10;
                                                if (wm20VarC.a(aVar) != y5bVar) {
                                                    wm20VarB = b();
                                                    aVar.c = 11;
                                                    if (wm20VarB.a(aVar) != y5bVar) {
                                                        wm20 wm20VarA11 = this.i.a(this, ohpVarArr[7]);
                                                        aVar.c = 12;
                                                        objA = wm20VarA11.a(aVar);
                                                        if (objA != y5bVar) {
                                                            return objA;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 2:
                uj50.b(obj);
                wm20VarA2 = this.e.a(this, ohpVarArr[3]);
                aVar.c = 3;
                if (wm20VarA2.a(aVar) != y5bVar) {
                    wm20VarA3 = this.d.a(this, ohpVarArr[2]);
                    aVar.c = 4;
                    if (wm20VarA3.a(aVar) != y5bVar) {
                        wm20VarA4 = this.n.a(this, ohpVarArr[13]);
                        aVar.c = 5;
                        if (wm20VarA4.a(aVar) != y5bVar) {
                            wm20VarA5 = this.o.a(this, ohpVarArr[14]);
                            aVar.c = 6;
                            if (wm20VarA5.a(aVar) != y5bVar) {
                                wm20VarA6 = this.p.a(this, ohpVarArr[15]);
                                aVar.c = 7;
                                if (wm20VarA6.a(aVar) != y5bVar) {
                                    wm20VarA7 = this.j.a(this, ohpVarArr[9]);
                                    aVar.c = 8;
                                    if (wm20VarA7.a(aVar) != y5bVar) {
                                        wm20VarA8 = this.k.a(this, ohpVarArr[10]);
                                        aVar.c = 9;
                                        if (wm20VarA8.a(aVar) != y5bVar) {
                                            wm20VarC = c();
                                            aVar.c = 10;
                                            if (wm20VarC.a(aVar) != y5bVar) {
                                                wm20VarB = b();
                                                aVar.c = 11;
                                                if (wm20VarB.a(aVar) != y5bVar) {
                                                    wm20 wm20VarA12 = this.i.a(this, ohpVarArr[7]);
                                                    aVar.c = 12;
                                                    objA = wm20VarA12.a(aVar);
                                                    if (objA != y5bVar) {
                                                        return objA;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 3:
                uj50.b(obj);
                wm20VarA3 = this.d.a(this, ohpVarArr[2]);
                aVar.c = 4;
                if (wm20VarA3.a(aVar) != y5bVar) {
                    wm20VarA4 = this.n.a(this, ohpVarArr[13]);
                    aVar.c = 5;
                    if (wm20VarA4.a(aVar) != y5bVar) {
                        wm20VarA5 = this.o.a(this, ohpVarArr[14]);
                        aVar.c = 6;
                        if (wm20VarA5.a(aVar) != y5bVar) {
                            wm20VarA6 = this.p.a(this, ohpVarArr[15]);
                            aVar.c = 7;
                            if (wm20VarA6.a(aVar) != y5bVar) {
                                wm20VarA7 = this.j.a(this, ohpVarArr[9]);
                                aVar.c = 8;
                                if (wm20VarA7.a(aVar) != y5bVar) {
                                    wm20VarA8 = this.k.a(this, ohpVarArr[10]);
                                    aVar.c = 9;
                                    if (wm20VarA8.a(aVar) != y5bVar) {
                                        wm20VarC = c();
                                        aVar.c = 10;
                                        if (wm20VarC.a(aVar) != y5bVar) {
                                            wm20VarB = b();
                                            aVar.c = 11;
                                            if (wm20VarB.a(aVar) != y5bVar) {
                                                wm20 wm20VarA13 = this.i.a(this, ohpVarArr[7]);
                                                aVar.c = 12;
                                                objA = wm20VarA13.a(aVar);
                                                if (objA != y5bVar) {
                                                    return objA;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 4:
                uj50.b(obj);
                wm20VarA4 = this.n.a(this, ohpVarArr[13]);
                aVar.c = 5;
                if (wm20VarA4.a(aVar) != y5bVar) {
                    wm20VarA5 = this.o.a(this, ohpVarArr[14]);
                    aVar.c = 6;
                    if (wm20VarA5.a(aVar) != y5bVar) {
                        wm20VarA6 = this.p.a(this, ohpVarArr[15]);
                        aVar.c = 7;
                        if (wm20VarA6.a(aVar) != y5bVar) {
                            wm20VarA7 = this.j.a(this, ohpVarArr[9]);
                            aVar.c = 8;
                            if (wm20VarA7.a(aVar) != y5bVar) {
                                wm20VarA8 = this.k.a(this, ohpVarArr[10]);
                                aVar.c = 9;
                                if (wm20VarA8.a(aVar) != y5bVar) {
                                    wm20VarC = c();
                                    aVar.c = 10;
                                    if (wm20VarC.a(aVar) != y5bVar) {
                                        wm20VarB = b();
                                        aVar.c = 11;
                                        if (wm20VarB.a(aVar) != y5bVar) {
                                            wm20 wm20VarA14 = this.i.a(this, ohpVarArr[7]);
                                            aVar.c = 12;
                                            objA = wm20VarA14.a(aVar);
                                            if (objA != y5bVar) {
                                                return objA;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 5:
                uj50.b(obj);
                wm20VarA5 = this.o.a(this, ohpVarArr[14]);
                aVar.c = 6;
                if (wm20VarA5.a(aVar) != y5bVar) {
                    wm20VarA6 = this.p.a(this, ohpVarArr[15]);
                    aVar.c = 7;
                    if (wm20VarA6.a(aVar) != y5bVar) {
                        wm20VarA7 = this.j.a(this, ohpVarArr[9]);
                        aVar.c = 8;
                        if (wm20VarA7.a(aVar) != y5bVar) {
                            wm20VarA8 = this.k.a(this, ohpVarArr[10]);
                            aVar.c = 9;
                            if (wm20VarA8.a(aVar) != y5bVar) {
                                wm20VarC = c();
                                aVar.c = 10;
                                if (wm20VarC.a(aVar) != y5bVar) {
                                    wm20VarB = b();
                                    aVar.c = 11;
                                    if (wm20VarB.a(aVar) != y5bVar) {
                                        wm20 wm20VarA15 = this.i.a(this, ohpVarArr[7]);
                                        aVar.c = 12;
                                        objA = wm20VarA15.a(aVar);
                                        if (objA != y5bVar) {
                                            return objA;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 6:
                uj50.b(obj);
                wm20VarA6 = this.p.a(this, ohpVarArr[15]);
                aVar.c = 7;
                if (wm20VarA6.a(aVar) != y5bVar) {
                    wm20VarA7 = this.j.a(this, ohpVarArr[9]);
                    aVar.c = 8;
                    if (wm20VarA7.a(aVar) != y5bVar) {
                        wm20VarA8 = this.k.a(this, ohpVarArr[10]);
                        aVar.c = 9;
                        if (wm20VarA8.a(aVar) != y5bVar) {
                            wm20VarC = c();
                            aVar.c = 10;
                            if (wm20VarC.a(aVar) != y5bVar) {
                                wm20VarB = b();
                                aVar.c = 11;
                                if (wm20VarB.a(aVar) != y5bVar) {
                                    wm20 wm20VarA16 = this.i.a(this, ohpVarArr[7]);
                                    aVar.c = 12;
                                    objA = wm20VarA16.a(aVar);
                                    if (objA != y5bVar) {
                                        return objA;
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 7:
                uj50.b(obj);
                wm20VarA7 = this.j.a(this, ohpVarArr[9]);
                aVar.c = 8;
                if (wm20VarA7.a(aVar) != y5bVar) {
                    wm20VarA8 = this.k.a(this, ohpVarArr[10]);
                    aVar.c = 9;
                    if (wm20VarA8.a(aVar) != y5bVar) {
                        wm20VarC = c();
                        aVar.c = 10;
                        if (wm20VarC.a(aVar) != y5bVar) {
                            wm20VarB = b();
                            aVar.c = 11;
                            if (wm20VarB.a(aVar) != y5bVar) {
                                wm20 wm20VarA17 = this.i.a(this, ohpVarArr[7]);
                                aVar.c = 12;
                                objA = wm20VarA17.a(aVar);
                                if (objA != y5bVar) {
                                    return objA;
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 8:
                uj50.b(obj);
                wm20VarA8 = this.k.a(this, ohpVarArr[10]);
                aVar.c = 9;
                if (wm20VarA8.a(aVar) != y5bVar) {
                    wm20VarC = c();
                    aVar.c = 10;
                    if (wm20VarC.a(aVar) != y5bVar) {
                        wm20VarB = b();
                        aVar.c = 11;
                        if (wm20VarB.a(aVar) != y5bVar) {
                            wm20 wm20VarA18 = this.i.a(this, ohpVarArr[7]);
                            aVar.c = 12;
                            objA = wm20VarA18.a(aVar);
                            if (objA != y5bVar) {
                                return objA;
                            }
                        }
                    }
                }
                return y5bVar;
            case 9:
                uj50.b(obj);
                wm20VarC = c();
                aVar.c = 10;
                if (wm20VarC.a(aVar) != y5bVar) {
                    wm20VarB = b();
                    aVar.c = 11;
                    if (wm20VarB.a(aVar) != y5bVar) {
                        wm20 wm20VarA19 = this.i.a(this, ohpVarArr[7]);
                        aVar.c = 12;
                        objA = wm20VarA19.a(aVar);
                        if (objA != y5bVar) {
                            return objA;
                        }
                    }
                }
                return y5bVar;
            case 10:
                uj50.b(obj);
                wm20VarB = b();
                aVar.c = 11;
                if (wm20VarB.a(aVar) != y5bVar) {
                    wm20 wm20VarA110 = this.i.a(this, ohpVarArr[7]);
                    aVar.c = 12;
                    objA = wm20VarA110.a(aVar);
                    if (objA != y5bVar) {
                        return objA;
                    }
                }
                return y5bVar;
            case 11:
                uj50.b(obj);
                wm20 wm20VarA111 = this.i.a(this, ohpVarArr[7]);
                aVar.c = 12;
                objA = wm20VarA111.a(aVar);
                if (objA != y5bVar) {
                    return y5bVar;
                }
                return objA;
            case 12:
                uj50.b(obj);
                return obj;
            default:
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // defpackage.dn20
    public final Object getBoolean(String str, v1b<? super Boolean> v1bVar) {
        return this.a.getBoolean(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Boolean> getBooleanByFlow(String str) {
        str.getClass();
        return this.a.getBooleanByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getDouble(String str, double d, v1b<? super Double> v1bVar) {
        return this.a.getDouble(str, d, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Double> getDoubleByFlow(String str) {
        str.getClass();
        return this.a.getDoubleByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getFloat(String str, float f, v1b<? super Float> v1bVar) {
        return this.a.getFloat(str, f, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Float> getFloatByFlow(String str) {
        str.getClass();
        return this.a.getFloatByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getInt(String str, int i, v1b<? super Integer> v1bVar) {
        return this.a.getInt(str, i, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Integer> getIntFlow(String str) {
        str.getClass();
        return this.a.getIntFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getLong(String str, long j, v1b<? super Long> v1bVar) {
        return this.a.getLong(str, j, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Long> getLongByFlow(String str) {
        str.getClass();
        return this.a.getLongByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getString(String str, v1b<? super String> v1bVar) {
        return this.a.getString(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<String> getStringByFlow(String str, String str2) {
        str.getClass();
        str2.getClass();
        return this.a.getStringByFlow(str, str2);
    }

    @Override // defpackage.dn20
    public final Object putBoolean(String str, Boolean bool, v1b<? super Unit> v1bVar) {
        return this.a.putBoolean(str, bool, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putDouble(String str, Double d, v1b<? super Unit> v1bVar) {
        return this.a.putDouble(str, d, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putFloat(String str, Float f, v1b<? super Unit> v1bVar) {
        return this.a.putFloat(str, f, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putInt(String str, Integer num, v1b<? super Unit> v1bVar) {
        return this.a.putInt(str, num, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putLong(String str, Long l, v1b<? super Unit> v1bVar) {
        return this.a.putLong(str, l, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putString(String str, String str2, v1b<? super Unit> v1bVar) {
        return this.a.putString(str, str2, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getBoolean(String str, boolean z, v1b<? super Boolean> v1bVar) {
        return this.a.getBoolean(str, z, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getDouble(String str, v1b<? super Double> v1bVar) {
        return this.a.getDouble(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getFloat(String str, v1b<? super Float> v1bVar) {
        return this.a.getFloat(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getInt(String str, v1b<? super Integer> v1bVar) {
        return this.a.getInt(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getLong(String str, v1b<? super Long> v1bVar) {
        return this.a.getLong(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getString(String str, String str2, v1b<? super String> v1bVar) {
        return this.a.getString(str, str2, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Boolean> getBooleanByFlow(String str, boolean z) {
        str.getClass();
        return this.a.getBooleanByFlow(str, z);
    }

    @Override // defpackage.dn20
    public final lyh<Double> getDoubleByFlow(String str, double d) {
        str.getClass();
        return this.a.getDoubleByFlow(str, d);
    }

    @Override // defpackage.dn20
    public final lyh<Float> getFloatByFlow(String str, float f) {
        str.getClass();
        return this.a.getFloatByFlow(str, f);
    }

    @Override // defpackage.dn20
    public final lyh<Integer> getIntFlow(String str, int i) {
        str.getClass();
        return this.a.getIntFlow(str, i);
    }

    @Override // defpackage.dn20
    public final lyh<Long> getLongByFlow(String str, long j) {
        str.getClass();
        return this.a.getLongByFlow(str, j);
    }

    @Override // defpackage.dn20
    public final lyh<String> getStringByFlow(String str) {
        str.getClass();
        return this.a.getStringByFlow(str);
    }
}
