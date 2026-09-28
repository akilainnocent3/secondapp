package defpackage;

import com.sportygames.goldmine.data.dto.TGGiftDTO;
import com.sportygames.goldmine.data.dto.TGUserDTO;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class cwe0 {
    public final t4l a;
    public final k5b b;

    @c0d(c = "com.sportygames.goldmine.usecase.TGGetUserUseCase$invoke$1", f = "TGGetUserUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<TGUserDTO, TGGiftDTO, v1b<? super p0f0>, Object> {
        public /* synthetic */ TGUserDTO a;
        public /* synthetic */ TGGiftDTO b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(TGUserDTO tGUserDTO, TGGiftDTO tGGiftDTO, v1b<? super p0f0> v1bVar) {
            a aVar = cwe0.this.new a(v1bVar);
            aVar.a = tGUserDTO;
            aVar.b = tGGiftDTO;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            TGUserDTO tGUserDTO = this.a;
            TGGiftDTO tGGiftDTO = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Double dValueOf = Double.valueOf(tGUserDTO.getBalance());
            String currency = tGUserDTO.getCurrency();
            boolean showCollection = tGUserDTO.getGameData().getShowCollection();
            List<Boolean> caveAvailabilities = tGUserDTO.getGameData().getCaveAvailabilities();
            ArrayList arrayList = new ArrayList(l48.r(caveAvailabilities, 10));
            int i = 0;
            for (Object obj2 : caveAvailabilities) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                arrayList.add(new Pair(Integer.valueOf(i), bool));
                i = i2;
            }
            return new p0f0(dValueOf, currency, showCollection, a4h.d(kpu.k(arrayList)), a4h.f(tGGiftDTO.getEntityList()));
        }
    }

    public cwe0(k5b k5bVar, t4l t4lVar) {
        t4lVar.getClass();
        k5bVar.getClass();
        this.a = t4lVar;
        this.b = k5bVar;
    }

    public final lyh<p0f0> a() {
        t4l t4lVar = this.a;
        return ozh.c(new s78(new yzh(new awe0(t4lVar.b()), new bwe0(3, null)), new dwe0(t4lVar.e()), new a(null)), this.b);
    }
}
