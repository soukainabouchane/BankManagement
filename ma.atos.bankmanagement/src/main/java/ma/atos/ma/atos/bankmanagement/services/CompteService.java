package ma.atos.ma.atos.bankmanagement.services;

import ma.atos.ma.atos.bankmanagement.Dtos.CompteDto;
import ma.atos.ma.atos.bankmanagement.entities.Compte;
import ma.atos.ma.atos.bankmanagement.exceptions.CompteException;

import java.util.List;

public interface CompteService {
    List<CompteDto> listComptes() throws CompteException;
    CompteDto getCompte(Long ribCompte);
    List<CompteDto> getCompteByTier(String numClient) throws CompteException;
    void createCompte(CompteDto compteDto);
    void deleteCompte(Long ribCompte) throws CompteException;
}