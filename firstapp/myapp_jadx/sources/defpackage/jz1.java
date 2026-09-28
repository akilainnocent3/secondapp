package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.chat.data.CodeChatChatsResponseDto;
import com.sporty.android.chat.data.UploadImageResponse;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jz1 implements jc7 {
    public final ca7 a;
    public final k5b b;

    @c0d(c = "com.sporty.android.chat.repo.BaseChatRepo$getBookingCodeChats$1", f = "BaseChatRepo.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super CodeChatChatsResponseDto>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = i;
            this.f = i2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = jz1.this.new a(this.e, this.f, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super CodeChatChatsResponseDto> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L46
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L39
            L21:
                defpackage.uj50.b(r7)
                jz1 r7 = defpackage.jz1.this
                ca7 r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                int r2 = r6.e
                int r4 = r6.f
                java.lang.Object r7 = r7.i(r2, r4, r6)
                if (r7 != r1) goto L39
                goto L45
            L39:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L46
            L45:
                return r1
            L46:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jz1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public jz1(ca7 ca7Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = ca7Var;
        this.b = k5bVar;
    }

    @Override // defpackage.jc7
    public final ct90<bi50<UploadImageResponse>> a(MultipartBody.Part part) {
        part.getClass();
        return this.a.a(part);
    }

    @Override // defpackage.jc7
    public final lyh<CodeChatChatsResponseDto> f(int i, int i2) {
        return ozh.c(new or60(new a(i, i2, null)), this.b);
    }
}
