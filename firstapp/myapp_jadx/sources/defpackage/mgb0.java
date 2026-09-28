package defpackage;

import android.accounts.Account;
import android.app.Activity;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.patron.KycHintExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public interface mgb0 {

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$clearSync$1", f = "SportyAccountManager.kt", l = {169}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.clear(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$documentAuditStatus$1", f = "SportyAccountManager.kt", l = {89}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Integer>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Integer> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object documentAuditStatus = mgb0.this.getDocumentAuditStatus(this);
                return documentAuditStatus == y5bVar ? y5bVar : documentAuditStatus;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$initSync$1", f = "SportyAccountManager.kt", l = {13}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.init(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$languageCode$1", f = "SportyAccountManager.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new d(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.setLanguageCode(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$lastAccount$1", f = "SportyAccountManager.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object lastAccount = mgb0.this.getLastAccount(this);
                return lastAccount == y5bVar ? y5bVar : lastAccount;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$lastAvatarUrl$1", f = "SportyAccountManager.kt", l = {47}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new f(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object lastAvatarUrl = mgb0.this.getLastAvatarUrl(this);
                return lastAvatarUrl == y5bVar ? y5bVar : lastAvatarUrl;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$lastAvatarUrl$2", f = "SportyAccountManager.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new g(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.setLastAvatarUrl(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$lastNickname$1", f = "SportyAccountManager.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;

        public h(v1b<? super h> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new h(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object lastNickname = mgb0.this.getLastNickname(this);
                return lastNickname == y5bVar ? y5bVar : lastNickname;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$lastNickname$2", f = "SportyAccountManager.kt", l = {56}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, v1b<? super i> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new i(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.setLastNickname(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$lastUserId$1", f = "SportyAccountManager.kt", l = {41, 41}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;

        public j(v1b<? super j> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new j(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r7 == r0) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                mgb0 r3 = defpackage.mgb0.this
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L1d
                if (r1 == r5) goto L19
                if (r1 != r4) goto L13
                defpackage.uj50.b(r7)
                goto L40
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L19:
                defpackage.uj50.b(r7)
                goto L29
            L1d:
                defpackage.uj50.b(r7)
                r6.a = r5
                java.lang.Object r7 = r3.getUserId(r6)
                if (r7 != r0) goto L29
                goto L3f
            L29:
                r1 = r7
                java.lang.String r1 = (java.lang.String) r1
                int r1 = r1.length()
                if (r1 <= 0) goto L33
                r2 = r7
            L33:
                java.lang.String r2 = (java.lang.String) r2
                if (r2 != 0) goto L43
                r6.a = r4
                java.lang.Object r7 = r3.getLastUserId(r6)
                if (r7 != r0) goto L40
            L3f:
                return r0
            L40:
                java.lang.String r7 = (java.lang.String) r7
                return r7
            L43:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mgb0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$loginTime$1", f = "SportyAccountManager.kt", l = {138}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Long>, Object> {
        public int a;

        public k(v1b<? super k> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new k(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Long> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object loginTime = mgb0.this.getLoginTime(this);
                return loginTime == y5bVar ? y5bVar : loginTime;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$loginTime$2", f = "SportyAccountManager.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new l(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.setLoginTime(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$loginType$1", f = "SportyAccountManager.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class m extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;

        public m(v1b<? super m> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new m(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((m) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object loginType = mgb0.this.getLoginType(this);
                return loginType == y5bVar ? y5bVar : loginType;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$loginType$2", f = "SportyAccountManager.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
    public static final class n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, v1b<? super n> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new n(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                this.a = 1;
                if (mgb0.this.setLoginType(str, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$selfExclusionType$1", f = "SportyAccountManager.kt", l = {116}, m = "invokeSuspend", v = 2)
    public static final class o extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;

        public o(v1b<? super o> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new o(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object selfExclusionType = mgb0.this.getSelfExclusionType(this);
                return selfExclusionType == y5bVar ? y5bVar : selfExclusionType;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$selfExclusionType$2", f = "SportyAccountManager.kt", l = {117}, m = "invokeSuspend", v = 2)
    public static final class p extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, v1b<? super p> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new p(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.setSelfExclusionType(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$selfExclusionUTCTimeStamp$1", f = "SportyAccountManager.kt", l = {105}, m = "invokeSuspend", v = 2)
    public static final class q extends tje0 implements Function2<v5b, v1b<? super Long>, Object> {
        public int a;

        public q(v1b<? super q> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new q(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Long> v1bVar) {
            return ((q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object selfExclusionUTCTimeStamp = mgb0.this.getSelfExclusionUTCTimeStamp(this);
                return selfExclusionUTCTimeStamp == y5bVar ? y5bVar : selfExclusionUTCTimeStamp;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$selfExclusionUTCTimeStamp$2", f = "SportyAccountManager.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(long j, v1b<? super r> v1bVar) {
            super(2, v1bVar);
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new r(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.setSelfExclusionUTCTimeStamp(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$showBalance$1", f = "SportyAccountManager.kt", l = {149}, m = "invokeSuspend", v = 2)
    public static final class s extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
        public int a;

        public s(v1b<? super s> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new s(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
            return ((s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object showBalance = mgb0.this.getShowBalance(this);
                return showBalance == y5bVar ? y5bVar : showBalance;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$showBalance$2", f = "SportyAccountManager.kt", l = {150}, m = "invokeSuspend", v = 2)
    public static final class t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(boolean z, v1b<? super t> v1bVar) {
            super(2, v1bVar);
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new t(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.setShowBalance(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$updateAvatarAndNicknameSync$1", f = "SportyAccountManager.kt", l = {164}, m = "invokeSuspend", v = 2)
    public static final class u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, String str2, v1b<? super u> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new u(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.updateAvatarAndNickname(this.c, this.d, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$updateLastAccountSync$1", f = "SportyAccountManager.kt", l = {158}, m = "invokeSuspend", v = 2)
    public static final class v extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, String str2, v1b<? super v> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new v(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((v) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.updateLastAccount(this.c, this.d, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$userCertStatus$1", f = "SportyAccountManager.kt", l = {80}, m = "invokeSuspend", v = 2)
    public static final class w extends tje0 implements Function2<v5b, v1b<? super Integer>, Object> {
        public int a;

        public w(v1b<? super w> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new w(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Integer> v1bVar) {
            return ((w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object userCertStatus = mgb0.this.getUserCertStatus(this);
                return userCertStatus == y5bVar ? y5bVar : userCertStatus;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$userCertStatus$2", f = "SportyAccountManager.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i, v1b<? super x> v1bVar) {
            super(2, v1bVar);
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new x(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.setUserCertStatus(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$userId$1", f = "SportyAccountManager.kt", l = {72}, m = "invokeSuspend", v = 2)
    public static final class y extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;

        public y(v1b<? super y> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new y(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((y) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object userId = mgb0.this.getUserId(this);
                return userId == y5bVar ? y5bVar : userId;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.core.injection.auth.SportyAccountManager$userId$2", f = "SportyAccountManager.kt", l = {73}, m = "invokeSuspend", v = 2)
    public static final class z extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str, v1b<? super z> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mgb0.this.new z(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((z) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (mgb0.this.setUserId(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    Object clear(v1b<? super Unit> v1bVar);

    @fae
    default void clearSync() {
        dj5.b(new a(null));
    }

    Object ensureLogin(Activity activity, v1b<? super Unit> v1bVar);

    lyh<Account> getAccountFlow();

    lyh<t8> getAccountHolderFlow();

    lyh<AccountInfo> getAccountInfoFlow();

    /* JADX INFO: renamed from: getDocumentAuditStatus */
    default int getCachedDocumentAuditStatus() {
        return ((Number) dj5.a(kotlin.coroutines.e.a, new b(null))).intValue();
    }

    Object getDocumentAuditStatus(v1b<? super Integer> v1bVar);

    lyh<Integer> getDocumentAuditStatusFlow();

    Object getKycHintExtra(v1b<? super KycHintExtra> v1bVar);

    lyh<KycHintExtra> getKycHintExtraFlow();

    default String getLanguageCode() {
        return getLanguageCode(null);
    }

    String getLanguageCode(String str);

    lyh<String> getLanguageFlow();

    Object getLastAccount(v1b<? super String> v1bVar);

    default String getLastAccount() {
        return (String) dj5.a(kotlin.coroutines.e.a, new e(null));
    }

    Object getLastAvatarUrl(v1b<? super String> v1bVar);

    default String getLastAvatarUrl() {
        return (String) dj5.a(kotlin.coroutines.e.a, new f(null));
    }

    Object getLastNickname(v1b<? super String> v1bVar);

    default String getLastNickname() {
        return (String) dj5.a(kotlin.coroutines.e.a, new h(null));
    }

    Object getLastUserId(v1b<? super String> v1bVar);

    default String getLastUserId() {
        return (String) dj5.a(kotlin.coroutines.e.a, new j(null));
    }

    default long getLoginTime() {
        return ((Number) dj5.a(kotlin.coroutines.e.a, new k(null))).longValue();
    }

    Object getLoginTime(v1b<? super Long> v1bVar);

    Object getLoginType(v1b<? super String> v1bVar);

    default String getLoginType() {
        return (String) dj5.a(kotlin.coroutines.e.a, new m(null));
    }

    Object getSelfExclusionType(v1b<? super String> v1bVar);

    /* JADX INFO: renamed from: getSelfExclusionType */
    default String getCachedSelfExclusionType() {
        return (String) dj5.a(kotlin.coroutines.e.a, new o(null));
    }

    /* JADX INFO: renamed from: getSelfExclusionUTCTimeStamp */
    default long getCachedSelfExclusionUTCTimeStamp() {
        return ((Number) dj5.a(kotlin.coroutines.e.a, new q(null))).longValue();
    }

    Object getSelfExclusionUTCTimeStamp(v1b<? super Long> v1bVar);

    Object getShowBalance(v1b<? super Boolean> v1bVar);

    default boolean getShowBalance() {
        return ((Boolean) dj5.a(kotlin.coroutines.e.a, new s(null))).booleanValue();
    }

    /* JADX INFO: renamed from: getUserCertStatus */
    default int getCachedUserCertStatus() {
        return ((Number) dj5.a(kotlin.coroutines.e.a, new w(null))).intValue();
    }

    Object getUserCertStatus(v1b<? super Integer> v1bVar);

    lyh<Integer> getUserCertStatusFlow();

    Object getUserId(v1b<? super String> v1bVar);

    default String getUserId() {
        return (String) dj5.a(kotlin.coroutines.e.a, new y(null));
    }

    boolean hasPersonalPage();

    Object init(v1b<? super Unit> v1bVar);

    @fae
    default void initSync() {
        dj5.b(new c(null));
    }

    boolean isLogin();

    lyh<Boolean> isLoginFlow();

    lyh<Boolean> isShowingBalanceFlow();

    Object isTwoFactorAuthEnabled(v1b<? super Boolean> v1bVar);

    AccountInfo lastAccountInfo();

    Object reloadAccountInfo(v1b<? super Unit> v1bVar);

    @fae
    void setAccountInfo(AccountInfo accountInfo);

    Object setDocumentAuditStatus(int i2, v1b<? super Unit> v1bVar);

    Object setKycHintExtra(KycHintExtra kycHintExtra, v1b<? super Unit> v1bVar);

    Object setLanguageCode(String str, v1b<? super Unit> v1bVar);

    @fae
    default void setLanguageCode(String str) {
        str.getClass();
        dj5.b(new d(str, null));
    }

    Object setLastAvatarUrl(String str, v1b<? super Unit> v1bVar);

    default void setLastAvatarUrl(String str) {
        dj5.b(new g(str, null));
    }

    Object setLastNickname(String str, v1b<? super Unit> v1bVar);

    default void setLastNickname(String str) {
        dj5.b(new i(str, null));
    }

    Object setLoginTime(long j2, v1b<? super Unit> v1bVar);

    default void setLoginTime(long j2) {
        dj5.b(new l(j2, null));
    }

    Object setLoginType(String str, v1b<? super Unit> v1bVar);

    default void setLoginType(String str) {
        dj5.b(new n(str, null));
    }

    Object setSelfExclusionType(String str, v1b<? super Unit> v1bVar);

    default void setSelfExclusionType(String str) {
        str.getClass();
        dj5.b(new p(str, null));
    }

    Object setSelfExclusionUTCTimeStamp(long j2, v1b<? super Unit> v1bVar);

    default void setSelfExclusionUTCTimeStamp(long j2) {
        dj5.b(new r(j2, null));
    }

    Object setShowBalance(boolean z2, v1b<? super Unit> v1bVar);

    default void setShowBalance(boolean z2) {
        dj5.b(new t(z2, null));
    }

    Object setTwoFactorAuthEnabled(boolean z2, v1b<? super Unit> v1bVar);

    Object setUserCertStatus(int i2, v1b<? super Unit> v1bVar);

    default void setUserCertStatus(int i2) {
        dj5.b(new x(i2, null));
    }

    Object setUserId(String str, v1b<? super Unit> v1bVar);

    default void setUserId(String str) {
        dj5.b(new z(str, null));
    }

    Object updateAvatarAndNickname(String str, String str2, v1b<? super Unit> v1bVar);

    @fae
    default void updateAvatarAndNicknameSync(String str, String str2) {
        str.getClass();
        str2.getClass();
        dj5.b(new u(str, str2, null));
    }

    Object updateLastAccount(String str, String str2, v1b<? super Unit> v1bVar);

    @fae
    default void updateLastAccountSync(String str, String str2) {
        str.getClass();
        str2.getClass();
        dj5.b(new v(str, str2, null));
    }
}
