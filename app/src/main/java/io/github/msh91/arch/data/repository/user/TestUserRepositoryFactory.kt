package io.github.msh91.arch.data.repository.user

import io.github.msh91.arch.data.model.user.TestUserModel
import io.github.msh91.arch.data.repository.BaseCloudRepository
import io.github.msh91.arch.di.qualifier.network.Mock
import io.reactivex.Single
import javax.inject.Inject

class TestUserRepositoryFactory @Inject constructor(
        @Mock private val cloudRepository: BaseCloudRepository
): TestUserRepository {

    override fun requestUser(testUserModel: TestUserModel): Single<TestUserModel> {
        return cloudRepository.requestUser(testUserModel)
    }
}