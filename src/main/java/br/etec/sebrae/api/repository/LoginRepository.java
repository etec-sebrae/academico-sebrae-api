package br.etec.sebrae.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.etec.sebrae.api.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long>{

}
