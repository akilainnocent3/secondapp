package defpackage;

import com.google.protobuf.Reader;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.usecase.GetPayMethodConfigUseCase$getCommonPayMethodConfigFlow$1", f = "GetPayMethodConfigUseCase.kt", l = {139}, m = "invokeSuspend", v = 2)
public final class fak extends tje0 implements jaj<Map<String, ? extends Boolean>, List<? extends String>, Boolean, String, v1b<? super z200>, Object> {
    public int A;
    public /* synthetic */ Map B;
    public /* synthetic */ List C;
    public /* synthetic */ boolean D;
    public /* synthetic */ String E;
    public final /* synthetic */ log0 F;
    public final /* synthetic */ CountryCodeName G;
    public final /* synthetic */ eak H;
    public y200 a;
    public eak b;
    public Collection c;
    public Iterator d;
    public Object e;
    public y200 f;
    public List i;
    public boolean v;
    public boolean w;
    public int y;
    public int z;

    public static final class a<T> implements Comparator {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String strJ = ((y200) t).j();
            List list = this.a;
            int iIndexOf = list.indexOf(strJ);
            int i = Reader.READ_DONE;
            if (iIndexOf == -1) {
                iIndexOf = Integer.MAX_VALUE;
            }
            Integer numValueOf = Integer.valueOf(iIndexOf);
            int iIndexOf2 = list.indexOf(((y200) t2).j());
            if (iIndexOf2 != -1) {
                i = iIndexOf2;
            }
            return numValueOf.compareTo(Integer.valueOf(i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fak(log0 log0Var, CountryCodeName countryCodeName, eak eakVar, v1b<? super fak> v1bVar) {
        super(5, v1bVar);
        this.F = log0Var;
        this.G = countryCodeName;
        this.H = eakVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x017a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01bb -> B:77:0x01bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01c6 -> B:79:0x01cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fak.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.jaj
    public final Object l(Map<String, ? extends Boolean> map, List<? extends String> list, Boolean bool, String str, v1b<? super z200> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        CountryCodeName countryCodeName = this.G;
        eak eakVar = this.H;
        fak fakVar = new fak(this.F, countryCodeName, eakVar, v1bVar);
        fakVar.B = map;
        fakVar.C = list;
        fakVar.D = zBooleanValue;
        fakVar.E = str;
        return fakVar.invokeSuspend(Unit.a);
    }
}
