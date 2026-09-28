package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.SocketOutcomeMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipSocketUpdater$eventSubscriber$1$1", f = "BetslipSocketUpdater.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class tv3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ uv3 b;
    public final /* synthetic */ SocketMarketMessage c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv3(uv3 uv3Var, SocketMarketMessage socketMarketMessage, v1b<? super tv3> v1bVar) {
        super(2, v1bVar);
        this.b = uv3Var;
        this.c = socketMarketMessage;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tv3(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tv3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01e1 A[Catch: all -> 0x0069, TryCatch #1 {all -> 0x0069, blocks: (B:9:0x0023, B:11:0x0044, B:12:0x004c, B:14:0x0052, B:17:0x005f, B:21:0x006e, B:25:0x007d, B:28:0x0083, B:33:0x0097, B:34:0x00a2, B:36:0x00b2, B:37:0x00bd, B:39:0x00c3, B:41:0x00d6, B:43:0x00e2, B:44:0x00e6, B:46:0x00ed, B:48:0x00fc, B:51:0x0106, B:54:0x0116, B:56:0x0122, B:59:0x012c, B:60:0x0130, B:62:0x0137, B:67:0x016c, B:69:0x018e, B:71:0x0195, B:73:0x01b4, B:78:0x01cb, B:81:0x01e1, B:83:0x020b, B:85:0x0211, B:90:0x0222, B:95:0x0242, B:97:0x0248, B:94:0x023a, B:98:0x024e, B:100:0x025d, B:99:0x0256, B:20:0x006c, B:91:0x022a), top: B:112:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x021e  */
    /* JADX WARN: Code duplicated, block: B:88:0x021f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0222 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:9:0x0023, B:11:0x0044, B:12:0x004c, B:14:0x0052, B:17:0x005f, B:21:0x006e, B:25:0x007d, B:28:0x0083, B:33:0x0097, B:34:0x00a2, B:36:0x00b2, B:37:0x00bd, B:39:0x00c3, B:41:0x00d6, B:43:0x00e2, B:44:0x00e6, B:46:0x00ed, B:48:0x00fc, B:51:0x0106, B:54:0x0116, B:56:0x0122, B:59:0x012c, B:60:0x0130, B:62:0x0137, B:67:0x016c, B:69:0x018e, B:71:0x0195, B:73:0x01b4, B:78:0x01cb, B:81:0x01e1, B:83:0x020b, B:85:0x0211, B:90:0x0222, B:95:0x0242, B:97:0x0248, B:94:0x023a, B:98:0x024e, B:100:0x025d, B:99:0x0256, B:20:0x006c, B:91:0x022a), top: B:112:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0248 A[Catch: all -> 0x0069, EDGE_INSN: B:97:0x0248->B:100:0x025d BREAK  A[LOOP:5: B:70:0x0193->B:98:0x024e], TryCatch #1 {all -> 0x0069, blocks: (B:9:0x0023, B:11:0x0044, B:12:0x004c, B:14:0x0052, B:17:0x005f, B:21:0x006e, B:25:0x007d, B:28:0x0083, B:33:0x0097, B:34:0x00a2, B:36:0x00b2, B:37:0x00bd, B:39:0x00c3, B:41:0x00d6, B:43:0x00e2, B:44:0x00e6, B:46:0x00ed, B:48:0x00fc, B:51:0x0106, B:54:0x0116, B:56:0x0122, B:59:0x012c, B:60:0x0130, B:62:0x0137, B:67:0x016c, B:69:0x018e, B:71:0x0195, B:73:0x01b4, B:78:0x01cb, B:81:0x01e1, B:83:0x020b, B:85:0x0211, B:90:0x0222, B:95:0x0242, B:97:0x0248, B:94:0x023a, B:98:0x024e, B:100:0x025d, B:99:0x0256, B:20:0x006c, B:91:0x022a), top: B:112:0x0023, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Collection collectionT0;
        String str;
        Object bVar;
        Throwable thA;
        Double dH;
        boolean z;
        y5b y5bVar = y5b.a;
        int i = this.a;
        int i2 = 1;
        if (i == 0) {
            uj50.b(obj);
            SocketMarketMessage socketMarketMessage = this.c;
            uv3 uv3Var = this.b;
            jrm jrmVar = uv3Var.a;
            try {
                zi50.a aVar = zi50.b;
                String str2 = socketMarketMessage.topic;
                str2.getClass();
                int i3 = 6;
                List listH = new Regex("\\^").h(str2.substring(0, StringsKt.V(6, str2, "^")));
                if (listH.isEmpty()) {
                    collectionT0 = m2g.a;
                    break;
                }
                ListIterator listIterator = listH.listIterator(listH.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        collectionT0 = m2g.a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                Object[] array = collectionT0.toArray(new String[0]);
                if (((String[]) array).length < 5) {
                    array = null;
                }
                String[] strArr = (String[]) array;
                if (strArr != null) {
                    strArr[4] = "~";
                    StringBuilder sb = new StringBuilder();
                    int length = strArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        sb.append(i4 != 0 ? "^" : "");
                        sb.append(strArr[i4]);
                        i4++;
                    }
                    Set set = (Set) jrmVar.c1().get(sb.toString());
                    if (set != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set) {
                            Selection selection = (Selection) obj2;
                            if (Intrinsics.g(selection.getEventId(), socketMarketMessage.eventId) && Intrinsics.g(selection.getMarketId(), socketMarketMessage.marketId)) {
                                arrayList.add(obj2);
                            }
                        }
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            int i6 = i5 + 1;
                            Selection selection2 = (Selection) arrayList.get(i5);
                            if (selection2.b.product != i2 || socketMarketMessage.jsonArray.getInt(i2) != 3) {
                                JSONArray jSONArrayOptJSONArray = socketMarketMessage.jsonArray.optJSONArray(8);
                                if (selection2.q()) {
                                    if (jSONArrayOptJSONArray == null) {
                                        z = i2;
                                        break;
                                    }
                                    Iterable iterableN = f.n(0, jSONArrayOptJSONArray.length());
                                    if (!(iterableN instanceof Collection) || !((Collection) iterableN).isEmpty()) {
                                        Iterator<Integer> it = iterableN.iterator();
                                        while (true) {
                                            if (((mwo) it).c) {
                                                if (new SocketOutcomeMessage(null, null, 0.0d, 0, null, 0, 0, 0, 255, null).create(jSONArrayOptJSONArray.getString(((zvo) it).nextInt())).isActive() != i2) {
                                                    z = 0;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    z = i2;
                                    break;
                                    selection2.b.update(socketMarketMessage.jsonArray);
                                    selection2.b.product = socketMarketMessage.jsonArray.getInt(i2);
                                    Event event = selection2.a;
                                    event.getClass();
                                    Market market = selection2.b;
                                    market.getClass();
                                    jrmVar.f(event, market, z);
                                } else {
                                    if (jSONArrayOptJSONArray != null) {
                                        int length2 = jSONArrayOptJSONArray.length();
                                        int i7 = 0;
                                        while (i7 < length2) {
                                            String string = jSONArrayOptJSONArray.getString(i7);
                                            string.getClass();
                                            List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{"#"}, false, 0, i3, null);
                                            if (selection2.c.id.equals(listSplit$default.get(0))) {
                                                long jOptLong = socketMarketMessage.jsonArray.optLong(7, -1L);
                                                Long lValueOf = Long.valueOf(jOptLong);
                                                if (jOptLong <= 0) {
                                                    lValueOf = null;
                                                }
                                                if (lValueOf == null) {
                                                    selection2.b.update(socketMarketMessage.jsonArray);
                                                    selection2.c.odds = (String) listSplit$default.get(2);
                                                    selection2.c.isActive = Integer.parseInt((String) listSplit$default.get(3));
                                                    str = (String) CollectionsKt.V(6, listSplit$default);
                                                    if (str != null) {
                                                        if (dH.doubleValue() > 1.0E-4d) {
                                                            dH = null;
                                                        }
                                                        if (dH != null) {
                                                            selection2.c.probability = dH.doubleValue();
                                                        }
                                                    }
                                                    zi50.a aVar2 = zi50.b;
                                                    selection2.b.lastOddsChangeTime = socketMarketMessage.jsonArray.getLong(7);
                                                    bVar = Unit.a;
                                                    thA = zi50.a(bVar);
                                                    if (thA != null) {
                                                        break;
                                                    }
                                                    itf0.a.e(thA);
                                                    break;
                                                }
                                                long jLongValue = lValueOf.longValue();
                                                ww2 ww2Var = uv3Var.b;
                                                Market market2 = selection2.b;
                                                market2.getClass();
                                                ww2Var.getClass();
                                                if (!ww2.b(market2, jLongValue)) {
                                                    selection2.b.update(socketMarketMessage.jsonArray);
                                                    selection2.c.odds = (String) listSplit$default.get(2);
                                                    selection2.c.isActive = Integer.parseInt((String) listSplit$default.get(3));
                                                    str = (String) CollectionsKt.V(6, listSplit$default);
                                                    if (str != null && (dH = b.h(str)) != null) {
                                                        if (dH.doubleValue() > 1.0E-4d) {
                                                            dH = null;
                                                        }
                                                        if (dH != null) {
                                                            selection2.c.probability = dH.doubleValue();
                                                        }
                                                    }
                                                    try {
                                                        zi50.a aVar3 = zi50.b;
                                                        selection2.b.lastOddsChangeTime = socketMarketMessage.jsonArray.getLong(7);
                                                        bVar = Unit.a;
                                                    } catch (Throwable th) {
                                                        zi50.a aVar4 = zi50.b;
                                                        bVar = new zi50.b(th);
                                                    }
                                                    thA = zi50.a(bVar);
                                                    if (thA != null) {
                                                        break;
                                                    }
                                                    itf0.a.e(thA);
                                                    break;
                                                }
                                                break;
                                            }
                                            i7++;
                                            i3 = 6;
                                        }
                                    } else {
                                        selection2.b.update(socketMarketMessage.jsonArray);
                                    }
                                    uv3Var.a.N0(selection2.a, selection2.b, selection2.c, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : selection2.d, (14336 & 64) != 0 ? k980.DEFAULT : selection2.e, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : true, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                                }
                            }
                            i5 = i6;
                            i2 = 1;
                            i3 = 6;
                        }
                    }
                }
            } catch (Throwable th2) {
                zi50.a aVar5 = zi50.b;
                Throwable thA2 = zi50.a(new zi50.b(th2));
                if (thA2 != null) {
                    itf0.a.f(thA2, "handleEventMsg exception", new Object[0]);
                }
            }
            b390 b390Var = uv3Var.d;
            Unit unit = Unit.a;
            this.a = 1;
            if (b390Var.emit(unit, this) == y5bVar) {
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
