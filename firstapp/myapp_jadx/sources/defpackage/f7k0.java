package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sporty.android.core.model.worldcuptournament.WorldCupTournamentPageGroup;
import com.sportybet.feature.worldcup.config.domain.model.WorldCupTournamentConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lf7k0;", "Lj8i0;", "b", "world-cup"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f7k0 extends j8i0 {
    public final v340 A;
    public final tfk a;
    public final vfk b;
    public final s6k0 c;
    public final d4k0 d;
    public final x9l e;
    public final jrp f;
    public final azm i;
    public final v6k0 v;
    public Map<String, WorldCupTournamentPageGroup> w;
    public final b390 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.feature.worldcup.tournament.presentation.viewmodel.WorldCupTournamentViewModel$1", f = "WorldCupTournamentViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return f7k0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            f7k0 f7k0Var = f7k0.this;
            if (i == 0) {
                uj50.b(obj);
                s6k0 s6k0Var = f7k0Var.c;
                this.a = 1;
                obj = s6k0Var.a(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            WorldCupTournamentConfig worldCupTournamentConfig = (WorldCupTournamentConfig) obj;
            if (worldCupTournamentConfig != null && worldCupTournamentConfig.isKnockoutDefaultTab()) {
                wwd0 wwd0Var = f7k0Var.z;
                qfg0 qfg0Var = qfg0.b;
                wwd0Var.getClass();
                wwd0Var.k(null, qfg0Var);
            }
            return Unit.a;
        }
    }

    public static final class b {
        public final w9l a;
        public final hrp b;
        public final List<WorldCupTeam> c;

        public b(w9l w9lVar, hrp hrpVar, List<WorldCupTeam> list) {
            w9lVar.getClass();
            hrpVar.getClass();
            list.getClass();
            this.a = w9lVar;
            this.b = hrpVar;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TournamentData(groupsState=");
            sb.append(this.a);
            sb.append(", knockoutState=");
            sb.append(this.b);
            sb.append(", loadedTeams=");
            return ng1.a(sb, this.c, ")");
        }
    }

    public static final class c implements lyh<String> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.worldcup.tournament.presentation.viewmodel.WorldCupTournamentViewModel$special$$inlined$map$1", f = "WorldCupTournamentViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.worldcup.tournament.presentation.viewmodel.WorldCupTournamentViewModel$special$$inlined$map$1$2", f = "WorldCupTournamentViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    WorldCupTeam worldCupTeam = (WorldCupTeam) obj;
                    String id = worldCupTeam != null ? worldCupTeam.getId() : null;
                    aVar.b = 1;
                    if (this.a.emit(id, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public c(uwd0 uwd0Var) {
            this.a = uwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.worldcup.tournament.presentation.viewmodel.WorldCupTournamentViewModel$tournamentData$1", f = "WorldCupTournamentViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<Unit, v1b<? super b>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return f7k0.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, v1b<? super b> v1bVar) {
            return ((d) create(unit, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objD = w5b.d(new g7k0(f7k0.this, null), this);
                return objD == y5bVar ? y5bVar : objD;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.feature.worldcup.tournament.presentation.viewmodel.WorldCupTournamentViewModel$uiState$1", f = "WorldCupTournamentViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements iaj<b, qfg0, String, v1b<? super e7k0>, Object> {
        public /* synthetic */ b a;
        public /* synthetic */ qfg0 b;
        public /* synthetic */ String c;

        public e(v1b<? super e> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(b bVar, qfg0 qfg0Var, String str, v1b<? super e7k0> v1bVar) {
            e eVar = f7k0.this.new e(v1bVar);
            eVar.a = bVar;
            eVar.b = qfg0Var;
            eVar.c = str;
            return eVar.invokeSuspend(Unit.a);
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r37v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:297)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
    }

    public f7k0(tfk tfkVar, vfk vfkVar, s6k0 s6k0Var, d4k0 d4k0Var, x9l x9lVar, jrp jrpVar, azm azmVar, v6k0 v6k0Var) {
        d4k0Var.getClass();
        azmVar.getClass();
        this.a = tfkVar;
        this.b = vfkVar;
        this.c = s6k0Var;
        this.d = d4k0Var;
        this.e = x9lVar;
        this.f = jrpVar;
        this.i = azmVar;
        this.v = v6k0Var;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.w = o2gVar;
        b390 b390VarB = d390.b(1, 0, null, 6);
        b390VarB.a(Unit.a);
        this.y = b390VarB;
        wwd0 wwd0VarA = xwd0.a(qfg0.a);
        this.z = wwd0VarA;
        c cVar = new c(d4k0Var.a());
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        this.A = e1i.e(r1i.a(r0i.d(b390VarB, new d(null)), wwd0VarA, cVar, new e(null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), new e7k0(0));
    }
}
